import java.util.*;

public class WidthSearch {
    /**
     * Width search realization
     * @param vertexTable Table of edges
     * @param startVertex Start vertex
     * @param endVertex End vertex
     * @return If path to vertex exist
     */
    public static boolean search(int[][] vertexTable, int startVertex, int endVertex) {
        Integer currentVertex = startVertex;
        List<Integer> visitedVertexes = new ArrayList<>();
        Queue<Integer> vertexesToVisit = new ArrayDeque<>();

        while (currentVertex != null) {
            visitedVertexes.add(currentVertex);
            if (currentVertex == endVertex) {
                return true;
            }

            for (int i = 0; i < vertexTable[currentVertex].length; i++) {
                int vertex = vertexTable[currentVertex][i];

                if (vertex != Integer.MAX_VALUE && !visitedVertexes.contains(i)
                        && !vertexesToVisit.contains(i)) {
                    vertexesToVisit.add(i);
                }
            }

            currentVertex = vertexesToVisit.poll();
        }

        return false;
    }
}
