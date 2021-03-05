public class BinarySearch {
    /**
     * Searching for giving element in array
     * @param mass Array to search in
     * @param toSearch element to search
     * @return Position of element or null if element not present
     */
    public static Integer search(int[] mass, int toSearch) {
        int leftBoarder = 0;
        int rightBorder = mass.length;
        int poolSize = mass.length;
        do {
            poolSize = (rightBorder - leftBoarder);

            int searchPosition = leftBoarder + (poolSize / 2);

            if (mass[searchPosition] == toSearch)
                return searchPosition;

            if (mass[searchPosition] < toSearch) {
                leftBoarder = searchPosition;
            }

            if (mass[searchPosition] > toSearch) {
                rightBorder = searchPosition;
            }
        } while (poolSize > 1);

        return null;
    }
}
