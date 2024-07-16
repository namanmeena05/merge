package com.thread;

public class JoinExample implements Runnable {
	private String name;

	public JoinExample(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "==" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new JoinExample("naman"));
		Thread t2 = new Thread(new JoinExample("ashu"));
		Thread t3 = new Thread(new JoinExample("annu"));
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		t3.start();
	}

}
