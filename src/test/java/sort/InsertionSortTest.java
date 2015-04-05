package sort;


import com.sort.InsertionSort;
import com.sort.Sort;
import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
     Sort sort = new InsertionSort();


    @Test
    public void testInsertionSortImp() throws Exception {

        int[] actuals = {49, 38, 65, 97, 76, 13, 27, 52, 49};
        int[] expecteds = {13, 27, 38, 49, 49, 52, 65, 76, 97};
        sort.sort(actuals);
        Assert.assertArrayEquals(expecteds, actuals);
}
}