package com.search;

import junit.framework.TestCase;
import org.junit.Test;

public class BinarySearchTest extends TestCase {
    BinarySearch search = new BinarySearch();


    @Test
    public void testSearch() throws Exception {

        int[] data = {05, 13, 19, 21, 37, 56, 64, 75, 80, 88, 92};
        assertEquals(2, search.search(data, 19));
        assertEquals(6, search.search(data, 64));
        assertEquals(10, search.search(data, 92));
        assertEquals(-1, search.search(data, 100));

    }
}