package com.thread;

public class BankTransactionJoinWaitExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000); // Initial balance: $1000

		// Create two threads for deposit and withdrawal
		Thread depositThread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				account.deposit(200); // Deposit $200, five times
			}
			synchronized (account) {
				account.notify(); // Notify waiting thread after deposits are done
			}
		});

		Thread withdrawThread = new Thread(() -> {
			synchronized (account) {
				try {
					account.wait(); // Wait for deposits to complete
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int i = 0; i < 5; i++) {
				account.withdraw(300); // Withdraw $300, five times
			}
		});

		depositThread.start();
		withdrawThread.start();

		// Wait for threads to complete
		try {
			depositThread.join();
			withdrawThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Print final balance
		System.out.println("Final balance: $" + account.getBalance());
	}
}

class BankAccount {
	private int balance;

	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}

	// Synchronized method to deposit money
	public synchronized void deposit(int amount) {
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " deposited $" + amount);
	}

	// Synchronized method to withdraw money
	public synchronized void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " withdrew $" + amount);
		} else {
			System.out.println(
					Thread.currentThread().getName() + " tried to withdraw $" + amount + " but insufficient balance");
		}
	}

	// Method to get current balance
	public int getBalance() {
		return balance;
	}
}
