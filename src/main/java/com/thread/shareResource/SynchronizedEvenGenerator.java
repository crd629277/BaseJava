package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/19.
 */
public class SynchronizedEvenGenerator implements Invariant{
    private int i;
    public synchronized void next() {
        i++;
        i++;
    }

    public synchronized int getValue() {
        return i;
    }

    @Override
    public InvariantState invariant() {
        int value = getValue();
        if (value % 2 == 0) {
            return new InvariantOK();
        } else {
            return new InvariantFailure(new Integer(value));
        }
    }

    public static void main(String[] args) {
        SynchronizedEvenGenerator generator = new SynchronizedEvenGenerator();
        new InvariantWatcher(generator, 5000);
        while (true) {
            generator.next();
        }
    }
}
