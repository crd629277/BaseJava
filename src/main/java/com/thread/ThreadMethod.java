package com.thread;

/**
 * Created by Chen on 2015/4/18.
 */
public class ThreadMethod {
    private int countDown = 5;
    private Thread thread;
    private String name;

    public ThreadMethod(String name) {
        this.name = name;
    }

    public void runThread() {
        if (thread == null) {
            thread = new Thread(name) {
                @Override
                public void run() {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) return;
                        try {
                            sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                public String toString() {
                    return getName() + ": " + countDown;
                }
            };
        }
        thread.start();
        System.out.println("ThreadMethod end");
    }
}
