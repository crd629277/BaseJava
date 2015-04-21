package com.thread;

/**
 * Created by Chen on 2015/4/14.
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;
    private volatile double d = 0;

    public SimpleThread() {
        super("" + ++threadCount);
        start();
    }

    public SimpleThread(int priority) {
        setDaemon(true);
        setPriority(priority);
        start();
    }


    @Override
    public String toString() {
        return super.toString()  + ": " + countDown;
    }

    @Override
    public void run() {
        while (true) {
            // An expensive, interruptable operation
//            for (int i=1; i<100000; i++)
//                d = d + (Math.PI + Math.E) / (double)i;
//            System.out.println(this);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (--countDown == 0) return;
            System.out.println(this);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        new SimpleThread(Thread.MAX_PRIORITY);

        for (int i=0; i<5; i++) {
            new SimpleThread();
        }

    }
}
