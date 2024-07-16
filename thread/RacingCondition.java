package com.thread;

public class RacingCondition extends Thread {

	public  Acount a = new Acount();
	public  Acount a1 = new Acount();

	public RacingCondition(String msg) {
		super(msg);
	}

	@Override
	public void run() { 
		for (int i = 0; i < 5; i++) {
			a.depsoite(getName(), 1000);
			

		}
	}

	public static void main(String[] args) {
		RacingCondition r1 = new RacingCondition("naman");
		RacingCondition r2 = new RacingCondition("ashu");
		r1.start();
		r2.start();

	}
}
