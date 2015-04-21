package com.thread.shareResource;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Chen on 2015/4/18.
 */
public class Timeout extends Timer {
    public Timeout(int delay, final String msg) {
        super(true);    //Damon thread
        schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(msg);
                System.exit(0);
            }
        }, delay);
    }



}
