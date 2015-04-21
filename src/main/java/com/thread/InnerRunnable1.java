package com.thread;

/**
 * Created by Chen on 2015/4/17.
 */
public class InnerRunnable1 {
    private int countDown = 5;
    private Inner inner;

    public InnerRunnable1(String name) {
        inner = new Inner(name);
    }

    private class Inner implements Runnable{
        Thread thread;
        Inner(String name) {
            thread = new Thread(this, name);
            thread.start();
        }

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
    }
}
