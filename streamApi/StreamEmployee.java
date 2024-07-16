package com.streamApi;

public class StreamEmployee {

	public String name;
	public int age;

	public StreamEmployee(String name, int age) {

		this.name = name;
		this.age = age;

		
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "StreamEmployee [name=" + name + ", age=" + age + "]";
	}

}
