package com.reflection;

public class DemoReflection {

	public static void main(String[] args) throws ClassNotFoundException {

	    Class myObjectClass = MyObject.class;
	    
	    System.out.println(myObjectClass);
	    
	    Class myObjectClassForName = Class.forName("com.reflection.MyObject");
	    
	    System.out.println(myObjectClassForName);

	}

}
