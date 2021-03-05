import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void searchPresentsElementsTest() {
        int[][] arraysToSearch = TestArrays.getSortedArrays();

        for (int i = 0; i < 5; i++) {
            assertTrue(BinarySearch.search(arraysToSearch[i], arraysToSearch[i][0]).intValue() == 0);
            assertTrue(BinarySearch.search(arraysToSearch[i], arraysToSearch[i][9]).intValue() == 9);
            assertTrue(BinarySearch.search(arraysToSearch[i], arraysToSearch[i][5]).intValue() == 5);
            assertTrue(BinarySearch.search(arraysToSearch[i], arraysToSearch[i][7]).intValue() == 7);
        }
    }

    @Test
    public void searchNotPresentsElementsTest() {
        int[][] arraysToSearch = TestArrays.getSortedArrays();

        for (int i = 0; i < 5; i++) {
            assertNull(BinarySearch.search(arraysToSearch[i], -777));
        }
    }
}