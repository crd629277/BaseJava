package com.thread.synblock;

/**
 * Created by Chen on 2015/5/1.
 */

import com.thread.shareResource.Timeout;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Random;

/**
 * Using pipes for inter-thread I/O
 */


class Sender extends Thread {
    private Random rand = new Random();
    private PipedWriter out = new PipedWriter();

    public PipedWriter getPipedWriter() {
        return out;
    }

    @Override
    public void run() {
        while (true) {
            for (char c = 'A'; c <= 'z'; c++) {
                try {
                    out.write(c);
                    sleep(rand.nextInt(500));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Receiver extends Thread {
    private PipedReader in;
    public Receiver(Sender sender) throws IOException {
        in = new PipedReader(sender.getPipedWriter());
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Read: " + in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


public class PipedIO {
    public static void main(String[] args) throws IOException {
        Sender sender = new Sender();
        Receiver receiver = new Receiver(sender);
        sender.start();
        receiver.start();
        new Timeout(4000, "Teminated");
    }

}
