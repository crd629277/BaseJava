package com.thread.synblock;

/**
 * Created by Chen on 2015/4/23.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Protect a Pair inside a thread-safe class
 */
abstract class PairManager {
    protected Pair pair = new Pair();
    private List list = new ArrayList();

    public synchronized Pair getPair() {
        return new Pair(pair.getX(), pair.getY());
    }

    protected void store() {
        list.add(getPair());
    }

    public abstract void doTask();
}

// Synchronized the entire method
class PairManager1 extends PairManager {
    @Override
    public synchronized void doTask() {
        pair.incrementX();
        pair.incrementY();
        store();
    }
}

// Use a critical section
class PairManager2 extends PairManager {
    @Override
    public void doTask() {
        synchronized (this) {
            pair.incrementX();
            pair.incrementY();
        }
        store();
    }
}


class PairManipulator extends Thread {
    private PairManager pm;
    private int checkCount = 0;

    private class PairCheck extends Thread {
        PairCheck() {
            start();
        }

        @Override
        public void run() {
            while (true) {
                checkCount++;
                pm.getPair().checkState();
            }
        }
    }

    public PairManipulator(PairManager pm) {
        this.pm = pm;
        start();
        new PairCheck();
    }

    @Override
    public void run() {
        while (true) {
            pm.doTask();
        }
    }

    public String toString() {
        return "Pair: " + pm.getPair() +
                " checkCount =" + checkCount;
    }
}