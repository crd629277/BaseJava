package com.thread;

/**
 * Created by Chen on 2015/4/13.
 */
public class MultiThread {

    public static void main(String[] args) {
        System.out.println("This is main...");

        ThreadUseExtends threadUseExtends = new ThreadUseExtends();
        Thread thread2 = new Thread(new ThreadUseRunnable(), "Second thread");

        threadUseExtends.start();

        thread2.start();
    }
}
