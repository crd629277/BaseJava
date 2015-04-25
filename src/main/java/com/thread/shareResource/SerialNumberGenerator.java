package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/21.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    // 操作符 ++ 不是原子操作，所以方法要加 synchronized  才行
    public static synchronized int nextSerialNumber() {
        return serialNumber++;
    }

}
