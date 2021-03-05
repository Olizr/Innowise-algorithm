import graph.Edge;
import graph.Vertex;

import java.util.*;

public class DijkstrasАlgorithm {
    /**
     * Realization of Dijkstras algorithm
     * @param from Start vertex
     * @param to End vertex
     * @return Length of path or null if path is not exist
     */
    public static Integer findPath(Vertex from, Vertex to) {
        //Store total min path to vertex
        Map<Vertex, Integer> availableVertexes = new HashMap<>();
        //Store best path to vertex
        Map<Vertex, Edge> bestParents = new HashMap<>();
        availableVertexes.put(from, 0);

        Set<Edge> availableEdges = new HashSet<>(from.getEdges());

        while (availableEdges.size() > 0) {
            Edge edge = findMinEdge(availableEdges);

            Integer newPathLength = availableVertexes.get(edge.getFrom());
            if (newPathLength == null) {
                newPathLength = 0;
            }
            newPathLength += edge.getWeight();

            Integer existingPath = availableVertexes.get(edge.getTo());
            if (existingPath == null) {
                existingPath = Integer.MAX_VALUE;
                availableEdges.addAll(edge.getTo().getEdges());
            }

            if (newPathLength < existingPath) {
                availableVertexes.put(edge.getTo(), newPathLength);
                //Set edges to update;
                bestParents.put(edge.getTo(), edge);
            }
        }

        return calculatePathLength(bestParents, from, to);
    }

    private static Integer calculatePathLength(Map<Vertex, Edge> bestParents, Vertex from, Vertex to) {
        Integer length = null;
        while (!to.equals(from) && bestParents.size() > 0) {
            Edge edge = bestParents.get(to);
            if (edge == null) {
                return null;
            }

            length += edge.getWeight();

            to = edge.getFrom();
        }

        return length;
    }

    private static Edge findMinEdge(Set<Edge> availableEdges) {
        if (availableEdges.size() == 0)
            return null;

        Edge min = availableEdges.stream().min((o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight())).get();

        availableEdges.remove(min);

        return min;
    }
}
