package com.thread;

/**
 * Created by Chen on 2015/4/17.
 */
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;

    private class Inner extends Thread{

        Inner(String name) {
            super(name);
            start();
        }

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
        @Override
        public String toString() {
            return getName() + ": " + countDown;
        }
    }

    public InnerThread1 (String name) {
        inner = new Inner(name);
    }

}
