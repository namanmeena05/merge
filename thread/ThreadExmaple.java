package com.thread;

public class ThreadExmaple extends Thread {

	 String name;

	public ThreadExmaple(String name) {
		// this.name = n;
		super(name);
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "=" + getName());
		}
	}

	public static void main(String[] args) {
		ThreadExmaple t = new ThreadExmaple("naman");
		ThreadExmaple t1 = new ThreadExmaple("anju");

		t.start();
		t1.start();
	}

}
