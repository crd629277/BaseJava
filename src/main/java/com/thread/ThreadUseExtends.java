package com.thread;

/**
 * Created by Chen on 2015/4/13.
 */
public class ThreadUseExtends extends Thread {
    public void run() {
        System.out.println("This is ThreadUseExtends...");

        try {
            System.out.println("ThreadUseExtends sleep 10 seconds...");
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
