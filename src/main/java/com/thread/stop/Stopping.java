package com.thread.stop;

/**
 * Created by Chen on 2015/5/1.
 */

import java.util.Timer;
import java.util.TimerTask;

/**
 * The safe way to stop a thread
 */

class CanStop extends Thread {
    private volatile boolean stop = false;      // Must be volatile
    private int counter = 0;
    @Override
    public void run() {
        while (!stop && counter < 100) {
            System.out.println(counter++);
        }
        if (stop) {
            System.out.println("Detected stop");
        }
    }
    public void requestStop() {
        stop = true;
    }
}

public class Stopping {
    public static void main(String[] args) {
        final CanStop stoppable = new CanStop();
        stoppable.start();

        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Request stop");
                stoppable.requestStop();
            }
        }, 500);
    }
}
