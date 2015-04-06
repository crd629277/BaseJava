package com.sort;


import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
     Sort sort = new QuickSort();


    @Test
    public void testSort() throws Exception {

        int[] actuals = {49, 38, 65, 97, 76, 13, 27, 52, 49};
        int[] expecteds = {13, 27, 38, 49, 49, 52, 65, 76, 97};
        sort.sort(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        int[] actuals2 = {3, 2, 1, 4};
        int[] expecteds2 = {1, 2, 3, 4};
        sort.sort(actuals2);
        Assert.assertArrayEquals(expecteds2, actuals2);
}
}