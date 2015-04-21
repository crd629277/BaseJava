package com.thread;

/**
 * Created by Chen on 2015/4/13.
 */
public class ThreadUseRunnable implements Runnable{
    @Override
    public void run() {

        System.out.println("This is ThreadUseRunnable...");

        try {
            System.out.println("ThreadUseRunnable sleep 10 seconds... ");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
