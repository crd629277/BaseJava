package com.thread;

/**
 * Created by Chen on 2015/4/17.
 */
public class InnerThread2 {
    private int countDow = 5;
    private Thread thread;

    public InnerThread2(String name) {
        thread = new Thread(name) {
            @Override
            public void run() {
                while (true) {
                    System.out.println(this);
                    if (--countDow == 0) return;
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            @Override
            public String toString() {
                return getName() + ": " + countDow;
            }

        };

        thread.start();
    }
}
