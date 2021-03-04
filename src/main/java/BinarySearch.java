public class BinarySearch {
    /**
     * Searching for giving element in array
     * @param mass Array to search in
     * @param toSearch element to search
     * @return Position of element or null if element not present
     */
    public static Integer Search(int[] mass, int toSearch) {
        int leftBoarder = 0;
        int rightBorder = mass.length;
        while (true) {
            int poolSize = (rightBorder - leftBoarder);

            int searchPosition = poolSize / 2;

            if (mass[searchPosition] == toSearch)
                return searchPosition;

            if (mass[searchPosition] > toSearch) {
                leftBoarder = searchPosition;
            }

            if (mass[searchPosition] < toSearch) {
                rightBorder = searchPosition;
            }

            if (poolSize < 2) {
                return null;
            }
        }
    }
}
