package org.yame.example;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;
import org.yame.example.bean.Person;


public class App {
	public static void main(String[] args){
		System.out.println("Hello,Yame!");
		
		Person person = new Person();
		person.setName("zhengym");
		
		
		try {
			PropertyUtils.setProperty(person, "name", "Name");
			String name = (String) PropertyUtils.getProperty(person, "name");
			PropertyUtils.setProperty(person, "address.street", "LTL build, Nansan,China");
			String street = person.getAddress().getStreet();
			System.out.println(street);
			System.out.println(name);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
