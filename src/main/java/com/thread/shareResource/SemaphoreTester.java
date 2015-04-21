package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/19.
 */
public class SemaphoreTester extends Thread {
    private volatile Semaphore semaphore;

    public SemaphoreTester(Semaphore semaphore) {
        this.semaphore = semaphore;
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            if (semaphore.available()) {
                yield();        // Makes it fail faster
                semaphore.acquire();
                yield();
                yield();
                yield();
                yield();
                semaphore.release();
                yield();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore();
        new SemaphoreTester(sem);
        new SemaphoreTester(sem);
        new InvariantWatcher(sem).join();
    }
}
