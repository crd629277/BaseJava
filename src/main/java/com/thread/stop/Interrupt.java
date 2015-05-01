package com.thread.stop;

/**
 * Created by Chen on 2015/5/1.
 */

import java.util.Timer;
import java.util.TimerTask;

/**
 * Using interrupt() to break out of a blocked thread
 */

class Blocked extends Thread {
    public Blocked() {
        System.out.println("Starting Blocked");
        start();
    }

    @Override
    public void run() {
        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Exiting run");
    }
}

public class Interrupt {
    static Blocked blocked = new Blocked();

    public static void main(String[] args) {
        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Preparing to interrupt");
                blocked.interrupt();
                blocked = null;
            }
        }, 2000);       // run() after 2000 milliseconds
    }
}
