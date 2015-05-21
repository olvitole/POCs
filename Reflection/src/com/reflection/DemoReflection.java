package com.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Olvi Tole
 * 
 *         This class demos various aspects of reflection followed from the
 *         following tutorial:
 *         http://tutorials.jenkov.com/java-reflection/index.html *
 */
public class DemoReflection {

	/**
	 * The main logic of the program that does the demos
	 * 
	 * Individual demos are organized in methods
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Demo Reflection on Class functionality
		classDemo();

	}

	private static void classDemo() {

		// class names
		Class myObjectClass = classNames();

		// Class Modifiers
		classModifiers(myObjectClass);

		// Package Info
		classPackage(myObjectClass);

		// SuperClass
		classSuperClass(myObjectClass);

		// Implemented Interfaces
		classInterfaces(myObjectClass);

		// Constructors
		classConstructors(myObjectClass);

		// Methods
		classMethods(myObjectClass);

		// Fields
		classFields(myObjectClass);

		// Annotations
		classAnnotations(myObjectClass);

	}

	private static void methodsDemo() {

		Method[] methods = MyObject.class.getMethods();

		for (Method method : methods) {
			System.out.println("method = " + method.getName());
		}
	}

	/**
	 * @return
	 */
	private static Class classNames() {

		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Calss Names");
		System.out.println("--------------------");
		Class myObjectClass = MyObject.class;
		System.out.println("At Compile Time:               " + myObjectClass);
		try {
			Class myObjectClassForName = Class
					.forName("com.reflection.MyObject");
			System.out.println("Looked up by name at Run Time: "
					+ myObjectClassForName);
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("Class not found" + classNotFoundException);
		}

		return myObjectClass;
	}

	private static void classModifiers(Class myObjectClass) {

		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Modifiers");
		System.out.println("--------------------");
		int modifiers = myObjectClass.getModifiers();
		System.out.println("modifiers: " + modifiers);

		System.out.println("Modifier.isAbstract(modifiers): "
				+ Modifier.isAbstract(modifiers));
		System.out.println("Modifier.isFinal(modifiers): "
				+ Modifier.isFinal(modifiers));
		System.out.println("Modifier.isInterface(modifiers): "
				+ Modifier.isInterface(modifiers));
		System.out.println("Modifier.isNative(modifiers): "
				+ Modifier.isNative(modifiers));
		System.out.println("Modifier.isPrivate(modifiers): "
				+ Modifier.isPrivate(modifiers));
		System.out.println("Modifier.isProtected(modifiers): "
				+ Modifier.isProtected(modifiers));
		System.out.println("Modifier.isPublic(modifiers): "
				+ Modifier.isPublic(modifiers));
		System.out.println("Modifier.isStatic(modifiers): "
				+ Modifier.isStatic(modifiers));
		System.out.println("Modifier.isStrict(modifiers): "
				+ Modifier.isStrict(modifiers));
		System.out.println("Modifier.isSynchronized(modifiers): "
				+ Modifier.isSynchronized(modifiers));
		System.out.println("Modifier.isTransient(modifiers): "
				+ Modifier.isTransient(modifiers));
		System.out.println("Modifier.isVolatile(modifiers): "
				+ Modifier.isVolatile(modifiers));

	}

	private static void classPackage(Class myObjectClass) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Package Info");
		System.out.println("--------------------");
		Package pack = myObjectClass.getPackage();
		System.out.println("Package: " + pack);

	}

	private static void classSuperClass(Class myObjectClass) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Super Class");
		System.out.println("--------------------");
		Class superCls = myObjectClass.getSuperclass();
		System.out.println("SuperClass: " + superCls);

	}

	private static void classInterfaces(Class myObjectClass) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Interfaces");
		System.out.println("--------------------");
		Class[] interfaces = myObjectClass.getInterfaces();

		for (Class c : interfaces) {
			System.out.println("Interface : " + c);
		}

	}

	private static void classConstructors(Class myObjectClass) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Constructors");
		System.out.println("--------------------");
		Constructor[] constructors = myObjectClass.getConstructors();
		for (Constructor c : constructors) {
			System.out.println("Constructor : " + c);
		}

	}

	private static void classMethods(Class myObjectClass) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Methods");
		System.out.println("--------------------");

		Method[] methods = myObjectClass.getMethods();
		for (Method c : methods) {
			System.out.println("Method : " + c);
		}

	}

	private static void classFields(Class myObjectClass) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Fields");
		System.out.println("--------------------");

		Field[] fields = myObjectClass.getFields();

		for (Field c : fields) {
			System.out.println("Field : " + c);
		}
		System.out.println("---");
		Field[] declaredFields = myObjectClass.getDeclaredFields();

		for (Field c : declaredFields) {
			System.out.println("Declared Field : " + c);
		}
	}

	private static void classAnnotations(Class myObjectClass) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("Annotations");
		System.out.println("--------------------");

		Annotation[] annotations = myObjectClass.getAnnotations();

		for (Annotation c : annotations) {
			System.out.println("Annotation: " + c);
		}
		System.out.println("---");
		Annotation[] declaredAnnotations = myObjectClass
				.getDeclaredAnnotations();

		for (Annotation c : declaredAnnotations) {
			System.out.println("Declared Annotation: " + c);
		}

	}

}
