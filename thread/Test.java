package com.thread;

public class Test extends Thread {
	public String name;

	public Test(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(name);

		}
	}

	public static void main(String[] args) {
		Test t1 = new Test("nmn");
		Test t2 = new Test("annu");
		t1.start();
		t2.start();
	}
}
