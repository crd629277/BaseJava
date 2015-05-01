package com.thread.synblock;

/**
 * Created by Chen on 2015/5/1.
 */

import com.thread.shareResource.Timeout;

import java.util.Random;

/**
 * Demonstrates how deadlock can be hidden in a program
 */

class Chopstick {
    private static int counter = 0;
    private int number = counter++;
    public String toString() {
        return "Chopstick " + number;
    }
}

class Philosopher extends Thread {
    private static Random rand = new Random();
    private static int counter = 0;
    private int number = counter++;
    private Chopstick leftChopstick;
    private Chopstick rightChopstick;
    static int ponder = 0;

    public Philosopher(Chopstick left, Chopstick right) {
        leftChopstick = left;
        rightChopstick = right;
        start();
    }

    public void think() {
        System.out.println(this + " thinking");
        if (ponder > 0) {
            try {
                sleep(rand.nextInt(ponder));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void eat() {
        synchronized (leftChopstick) {
            System.out.println(this + " has "
                    + this.leftChopstick + " Waiting for "
                    + this.rightChopstick);

            synchronized (rightChopstick) {
                System.out.println(this + " eating");
            }
        }
    }

    public String toString() {
        return "Philosopher " + number;
    }

    public void run() {
        while (true) {
            think();
            eat();
        }
    }
}


public class DiningPhilosophers {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("usage: \n" +
                "number of philosopher \n"  +
                "sleep time during think \n" +
                "deadlock? (Y/N) \n" +
                "timeout \n");
            System.exit(1);
        }

        Philosopher[] philosophers = new Philosopher[Integer.parseInt(args[0])];
        Philosopher.ponder = Integer.parseInt(args[1]);
        Chopstick left = new Chopstick();
        Chopstick right = new Chopstick();
        Chopstick first = left;

        int i = 0;
        while (i < philosophers.length-1){
            philosophers[i++] = new Philosopher(left, right);
            left = right;
            right = new Chopstick();
        }

        if ("Y".equals(args[2])) {
            philosophers[i] = new Philosopher(left, first);
        } else {
            philosophers[i] = new Philosopher(first, left);
        }

        if (args.length >= 4) {
            int delay = Integer.parseInt(args[3]);
            if (delay != 0) {
                new Timeout(delay*1000, "Time Out");
            }
        }
    }

}
