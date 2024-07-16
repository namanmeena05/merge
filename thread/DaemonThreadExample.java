package com.thread;

public class DaemonThreadExample extends Thread {

	@Override
	public void run() {
		System.out.println("Daemon Thread started " + Thread.currentThread());

		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("Daemon Thread woke up again");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		DaemonThreadExample d = new DaemonThreadExample();
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Leaving Main Method");
		System.out.println("Now JVM will exits");
	}

}
