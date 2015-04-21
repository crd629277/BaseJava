package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/18.
 */
public class AlwaysEven {
    private int i;

    public void next() {
        i++;
        i++;
    }

    public int getValue() {
        return i;
    }

    public static void main(String[] args) {
        final AlwaysEven alwaysEven = new AlwaysEven();

        new Thread("Watcher") {
            @Override
            public void run() {
                while (true) {
                    int value = alwaysEven.getValue();
                    if (value % 2 != 0) {
                        System.out.println(value);
                        System.exit(0);
                    }
                }
            }
        }.start();

        while (true) {
            alwaysEven.next();
        }
    }

}
