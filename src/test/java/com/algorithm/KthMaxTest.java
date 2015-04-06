package com.algorithm;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class KthMaxTest {
     KthMax kthMax = new KthMax();


    @Test
    public void testFindKthMax() throws Exception {
        long startTime = System.currentTimeMillis();
        int[] actuals = {49, 38, 65, 97, 76, 13, 27, 52, 49};
        int expected = 76;
        int result = kthMax.findKthMax(actuals, 2);
        System.out.println("Total Time: " + (System.currentTimeMillis() - startTime));
        assertEquals(expected, result);
}
}