package com.ust.javaconfic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class HelloWorldImpl implements HelloWorld {
	@Override
	public String message() {
		return "This is first java coniguration";
	}
	
		
	}



