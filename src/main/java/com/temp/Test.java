package com.temp;

/**
 * Created by chenwinfred on 6/21/15.
 */
public class Test {
    int i=0;

    public static void main(String[] args) {
        Test test = new Test();
        test.unknow(4);
    }

    void unknow(int w) {
        if (w != 0) {
            unknow(w - 1);
            for (int i = 1; i <= w; i++) {
                System.out.print(w);
            }
            System.out.println();
        }
    }

}
