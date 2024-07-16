package com.thread;

public class ExampleBank extends Thread {

	private static double balance = 8000;
	public double withdraw;

	public ExampleBank(String name, double withdraw) {
		super(name);
		this.withdraw = withdraw;
	}

	public void withdraw() {
		System.out.println("in withdraw");
		synchronized (ExampleBank.class) {
			if (withdraw <= balance) {
				balance -= withdraw;
				System.out.println(getName() + "  Withdraw Successfully " + "    Remaining balance " + balance);
			} else {
				System.out.println("Insufficient Balance");
			}
		}
	}

	@Override
	public void run() {
		withdraw();
	}


	public static void main(String[] args) {
		ExampleBank e1 = new ExampleBank("naman", 1000);
		ExampleBank e2 = new ExampleBank("ashu", 1000);
		ExampleBank e3 = new ExampleBank("deepak", 1000);
		ExampleBank e4 = new ExampleBank("sourabh", 1000);
		ExampleBank e5 = new ExampleBank("anju", 1000);
		ExampleBank e6 = new ExampleBank("pooja", 1000);
		ExampleBank e7 = new ExampleBank("saloni", 1000);

		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();
		e6.start();
		e7.start();
		System.out.println(balance);
	}

}
