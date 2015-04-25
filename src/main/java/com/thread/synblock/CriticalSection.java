package com.thread.synblock;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Chen on 2015/4/23.
 */
public class CriticalSection {
    public static void main(String[] args) {
        final PairManipulator pm1 = new PairManipulator(new PairManager1()),
                pm2 = new PairManipulator(new PairManager2());

        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("pm1: " + pm1);
                System.out.println("pm2: " + pm2);
                System.exit(0);
            }
        }, 500);    // run() after 500 milliseconds

    }




}
