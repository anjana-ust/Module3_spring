package com.ust.iocautowiring;
import javax.annotation.*;

import org.springframework.beans.factory.annotation.Qualifier;
public class B {
	A a;
public B() {
	// TODO Auto-generated constructor stub
}
	
public B(A a) {
	this.a=a;
	System.out.println("from B() constructor...");
}
@Qualifier("a")
	public void setA(A a) { 
		//byName byType will use setter injection
		System.out.println("setA()..is called");
		this.a = a;
	}
	@PostConstruct // equal to init()
	public void setUp() {
		System.out.println("from setUp().....");
	}
	@PreDestroy
	public void windup() {
		System.out.println("from windup()....");
	}
	
}
