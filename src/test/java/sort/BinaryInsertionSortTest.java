package sort;


import com.sort.BinaryInsertionSort;
import com.sort.Sort;
import junit.framework.TestCase;
import org.junit.Test;

public class BinaryInsertionSortTest extends TestCase {
     Sort sort = new BinaryInsertionSort();


    @Test
    public void testInsertionSortImp() throws Exception {

        int[] data = {5, 3, 4, 7, 6, 9};
        int[] data2 = {0, 3, 4, 7, 6, 6, 10, 3};
        sort.sort(data);
        sort.sort(data2);

    }
}