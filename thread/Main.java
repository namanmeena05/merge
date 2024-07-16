package com.thread;

class Storage {
    private int value;
    private final Object lock = new Object();

    public Storage() {
        this.value = 0;
    }

    public void setValue(int value) {
        synchronized (lock) {
            this.value = value;
        }
    }

    public int getValue() {
        synchronized (lock) {
            return value;
        }
    }
}

class Counter extends Thread {
    private final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            // Incrementing the counter
            synchronized (storage) {
                int currentValue = storage.getValue();
                storage.setValue(currentValue + 1);
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Printer extends Thread {
    private final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        while (true) {
            // Reading and printing value from storage
            synchronized (storage) {
                int value = storage.getValue();
                System.out.println("Value: " + value);
            }
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        counter.start();
        printer.start();
    }
}
