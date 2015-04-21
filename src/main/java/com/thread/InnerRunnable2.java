package com.thread;

/**
 * Created by Chen on 2015/4/17.
 */
public class InnerRunnable2 {
    private int countDown = 5;
    private Thread thread;

    public InnerRunnable2(String name) {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) return;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            @Override
            public String toString() {
                return thread.getName() + ": " + countDown;
            }

        }, name);

        thread.start();
    }
}
