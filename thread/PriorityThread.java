package com.thread;

public class PriorityThread extends Thread {

	public PriorityThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + "=" + i + "=" + getPriority());
		}
	}

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(7);
		PriorityThread p1 = new PriorityThread("naman");
		PriorityThread p2 = new PriorityThread("ashu");
		PriorityThread p3 = new PriorityThread("annu");

		p1.setPriority(1);
		p2.setPriority(10);
		p1.start();
		p2.start();
		p3.start();
	}

}
