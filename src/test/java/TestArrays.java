public class TestArrays {
    public static int[][] getArrays() {
        int[][] arrays = new int[5][10];

        arrays[0] = new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
        arrays[1] = new int[] {10, 9, 8, 7, 6 , 5, 4, 3, 2, 1};
        arrays[2] = new int[] {155, 12, 13, 4, 1, 1, 7, -38 ,9, 12220};
        arrays[3] = new int[] {-1, -2, 3, 4, 100, 8, 7, -8 ,-9, -10};
        arrays[4] = new int[] {32, 452, 314, 124, 53, 985, 21, 8111 ,-2222, 1120};

        return arrays;
    }

    public static  int[][] getSortedArrays() {
        int[][] arrays = new int[5][10];

        arrays[0] = new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
        arrays[1] = new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
        arrays[2] = new int[] {-38, 1, 1, 4, 7, 9, 12, 13, 155, 12220};
        arrays[3] = new int[] {-10, -9 ,-8, -2, -1, 3, 4, 7, 8, 100};
        arrays[4] = new int[] {-2222, 21, 32, 53, 124, 314, 452, 985, 1120, 8111};

        return arrays;
    }
}
