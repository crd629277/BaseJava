package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/19.
 */
public class InvariantWatcher extends Thread{
    private Invariant invariant;

    public InvariantWatcher(Invariant invariant) {
        this.invariant = invariant;
        setDaemon(true);
        start();
    }

    public InvariantWatcher(Invariant invariant, final int timeOut) {
        this(invariant);
        new Timeout(timeOut, "Time out without violating invariant");

    }

    @Override
    public void run() {
        while (true) {
            InvariantState state = invariant.invariant();
            if (state instanceof InvariantFailure) {
                System.out.println("Invariant violated: " +
                        ((InvariantFailure) state).value);
                System.exit(0);
            }
        }
    }

}
