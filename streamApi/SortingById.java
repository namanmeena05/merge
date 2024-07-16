package com.streamApi;

public class SortingById {
	public String name;
	public int id;
	
	public SortingById(String name, int id) {
	
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
