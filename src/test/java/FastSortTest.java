import org.junit.Assert;
import org.junit.Test;

public class FastSortTest {
    @Test
    public void sort() {
        int[][] arraysToSort = TestArrays.getArrays();
        int[][] sortedArrays = TestArrays.getSortedArrays();

        for (int i = 0; i < 5; i++) {
            FastSort.sort(arraysToSort[i]);
            Assert.assertArrayEquals(arraysToSort[i], sortedArrays[i]);
        }
    }
}