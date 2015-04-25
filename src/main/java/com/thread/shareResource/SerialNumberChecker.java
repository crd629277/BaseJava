package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/22.
 */
public class SerialNumberChecker {
    private static CircularSet serials = new CircularSet(1000000);

    static class SerialChecker extends Thread{
        SerialChecker() {
            start();
        }

        @Override
        public void run() {
            int serial = SerialNumberGenerator.nextSerialNumber();
            if (serials.contains(serial)) {
                System.out.println("Duplicated: " + serial);
                System.exit(0);
            }
            serials.add(serial);
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<1000; i++) {
            new SerialChecker();
        }
        new Timeout(4000, "No duplicates detected");
    }
}
