package com.thread;

public class PlayerThread extends Thread {

	public PlayerThread(ThreadGroup tg, String name) {
		super(tg, name);
	}

	@Override
	public void run() {

		for (int match = 1; match < 10; match++) {
			String msg = getName();
			msg += "  Played Match# " + match;
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		ThreadGroup team = new ThreadGroup("Team India");
		PlayerThread p1 = new PlayerThread(team, "Jay");
		PlayerThread p2 = new PlayerThread(team, "vijay");
		p1.start();
		p2.start();
		System.out.println("Thread Group Info");
		System.out.println("Name : " + team.getName());
		System.out.println("Parent Group: " + team.getParent());

		System.out.println("Active threads " + team.activeCount());
		System.out.println("Active subgroup " + team.activeGroupCount());
	}
}
