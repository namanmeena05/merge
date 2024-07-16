package com.thread;

public class Acount {
	private double balance;

	public double getBalance() {
		delay();
		return balance;
	}

	public void setBalance(double balance) {
		delay();
		this.balance = balance;
	}

	public synchronized void depsoite(String msg, double amt) {
		delay();
		double bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + "  " + bal);

	}
	public void delay()  {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
