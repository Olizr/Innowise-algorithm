public class FastSort {
    /**
     * Sorting arrays using fast sort
     * @param mass array to sort
     * @return sorted array
     */
    public static int[] sort(int[] mass) {
        sort(mass, 0, mass.length - 1);
        return mass;
    }

    /**
     * Recursive fast sort
     * @param mass array to sort
     * @param leftBorder Left position for start
     * @param rightBorder Right position to start
     */
    private static void sort(int[] mass, int leftBorder, int rightBorder) {
        int leftPosition = leftBorder;
        int rightPosition = rightBorder;
        int sortElement = mass[leftBorder + (rightBorder - leftBorder) / 2];

        if (leftPosition >= rightPosition)
            return;

        while (rightPosition >= leftPosition) {
            while (mass[rightPosition] > sortElement) {
                rightPosition--;
            }

            while (mass[leftPosition] < sortElement) {
                leftPosition++;
            }

            if (rightPosition >= leftPosition) {
                if (rightPosition > leftPosition) {
                    swap(mass, leftPosition, rightPosition);
                }

                leftPosition++;
                rightPosition--;
            }
        }

        if (leftPosition < rightBorder) {
            sort(mass, leftPosition, rightBorder);
        }

        if (leftBorder < rightPosition) {
            sort(mass, leftBorder, rightPosition);
        }
    }

    private static void swap(int[] mass, int pos1, int pos2){
        int temp = mass[pos1];
        mass[pos1] = mass[pos2];
        mass[pos2] = temp;
    }
}
