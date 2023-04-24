package com.ust.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		//All beans are auto promoted to object type
		Object obj = factory.getBean("connection");
		System.out.println(obj);
		Object obj2 = factory.getBean("login");
		Login login = (Login)obj2; // type cast(down casting)
		login.validate();
		
   

	}

}
