package com.reflection;

@MyClassNameAnnotation(name = "MyNameAnnotation")
public class MyObject extends MyParentClass implements MyInterfaceOne,
		MyInterfaceTwo {

	public String testPublicField;

	private String name;

	private String description;

	private int dimention;

	public MyObject() {
		super();
	}

	public MyObject(String name) {
		this.name = name;

	}

	public MyObject(String name, String description) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDimention() {
		return dimention;
	}

	public void setDimention(int dimention) {
		this.dimention = dimention;
	}

	@Override
	public String toString() {
		return "MyObject [name=" + name + "]";
	}

}
