package com.streamApi;

public class SortingByName {
	public String name;
	public int id;
	
	public SortingByName(String name, int id) {
	
		this.name=name;
		this.id=id;
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SortingById [name=" + name + ", id=" + id + "]";
	}
	
	

}