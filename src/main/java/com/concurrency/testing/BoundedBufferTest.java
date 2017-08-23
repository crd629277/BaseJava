package com.concurrency.testing;

import junit.framework.TestCase;

/**
 * Created by chenwinfred on 7/5/15.
 */
public class BoundedBufferTest extends TestCase {
    public void testIsEmptyWhenConstructed() {
        BoundedBuffer<Integer> bb = new BoundedBuffer<Integer>(10);
        assertTrue(bb.isEmpty());
        assertFalse(bb.isFull());
    }

    public void testIsFullAfterPuts() throws InterruptedException {
        BoundedBuffer<Integer> bb = new BoundedBuffer<Integer>(10);
        for (int i = 0; i < 10; i++) {
            bb.put(i);
        }
        assertTrue(bb.isFull());
        assertFalse(bb.isEmpty());
    }

    public void testTakeBlocksWhenEmpty() {
        final BoundedBuffer<Integer> bb = new BoundedBuffer<Integer>(10);
        Thread taker = new Thread() {
            public void run() {
                try {
                    int unused = bb.take();
                    fail();
                } catch (InterruptedException e) {
                }
            }
        };


        try {
            taker.start();
            Thread.sleep(5000);
            taker.interrupt();
            taker.join();
            assertFalse(taker.isAlive());
        } catch (InterruptedException e) {
            fail();
        }

    }

}
