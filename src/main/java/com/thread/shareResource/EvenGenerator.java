package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/19.
 */
public class EvenGenerator implements Invariant{
    private int i;
    public void next() {
        i++;
        i++;
    }

    public int getValue() {
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
        EvenGenerator generator = new EvenGenerator();
        new InvariantWatcher(generator);
        while (true) {
            generator.next();
        }
    }
}
