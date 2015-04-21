package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/19.
 */
public class Semaphore implements Invariant {
    private volatile int semaphore = 0;
    public boolean available() {
        return semaphore == 0;
    }
    public void acquire() {
        ++semaphore;
    }
    public void release() {
        --semaphore;
    }

    @Override
    public InvariantState invariant() {
        int value = semaphore;
        if (value == 0 || value ==1) {
            return new InvariantOK();
        } else {
            return new InvariantFailure(new Integer(value));
        }
    }
}
