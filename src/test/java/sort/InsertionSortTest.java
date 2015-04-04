package sort;


import com.sort.InsertionSort;
import com.sort.Sort;
import org.junit.Test;

public class InsertionSortTest {
     Sort sort = new InsertionSort();


    @Test
    public void testInsertionSortImp() throws Exception {

        int[] data = {5, 3, 4, 7, 6, 9};
        int[] data2 = {0, 3, 4, 7, 6, 6, 10, 3};
        sort.sort(data);
        sort.sort(data2);

    }
}