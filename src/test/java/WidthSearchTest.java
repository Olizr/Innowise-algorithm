import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WidthSearchTest {
    private static final int MAX = Integer.MAX_VALUE;
    private int[][] tableCanReach = new int[][] {{MAX, 1, 1, MAX, MAX, MAX},
                                                {MAX, MAX, MAX, 1, MAX, MAX},
                                                {MAX, MAX, MAX, 1, 1, MAX},
                                                {MAX, MAX, MAX, MAX, 1, MAX},
                                                {MAX, MAX, MAX, MAX, MAX, 1},
                                                {MAX, MAX, MAX, 1, MAX, MAX}};

    private int[][] tableCannotReach = new int[][] {{MAX, 1, 1, MAX, MAX, MAX},
                                                {MAX, MAX, MAX, 1, MAX, MAX},
                                                {MAX, MAX, MAX, 1, 1, MAX},
                                                {MAX, MAX, MAX, MAX, 1, MAX},
                                                {MAX, MAX, MAX, MAX, MAX, MAX},
                                                {MAX, MAX, MAX, 1, MAX, MAX}};

    @Test
    public void searchCanReachTest() {
        Assert.assertTrue(WidthSearch.search(tableCanReach, 0, 3));
        Assert.assertTrue(WidthSearch.search(tableCanReach, 0, 5));
        Assert.assertTrue(WidthSearch.search(tableCanReach, 2, 5));
        Assert.assertTrue(WidthSearch.search(tableCanReach, 5, 3));
    }

    @Test
    public void searchCannotReachTest() {
        Assert.assertTrue(!WidthSearch.search(tableCannotReach, 0, 5));
        Assert.assertTrue(!WidthSearch.search(tableCannotReach, 1, 2));
        Assert.assertTrue(!WidthSearch.search(tableCannotReach, 5, 0));
    }
}