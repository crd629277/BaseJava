package com.thread;

/**
 * Created by Chen on 2015/4/17.
 */
public class RunnableThread implements Runnable{
    private int countDown = 5;

    @Override
    public String toString() {
        return "#" + Thread.currentThread().getName() + ": "  + countDown;
    }

    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        for (int i=1; i<5; i++) {
            new Thread(new RunnableThread(), "" + i).start();
        }
    }
}
