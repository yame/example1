package org.yamr.example;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.yamr.example.bean.Person;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello,Yame!");

		Person person = new Person();
		person.setName("zhengym");

		try {
			PropertyUtils.setProperty(person, "name", "Name");
			String name = (String) PropertyUtils.getProperty(person, "name");
			PropertyUtils.setProperty(person, "address.street",
					"LTL build, Nansan,China");
			String street = person.getAddress().getStreet();
			System.out.println(street);
			System.out.println(name);
			
			Log logger =  LogFactory.getLog(App.class);
			logger.info("HI");
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
