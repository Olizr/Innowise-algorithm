import graph.Edge;
import graph.Vertex;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DijkstrasАlgorithmTest {

    private List<Vertex> generateVertexes() {
        List<Vertex> vertexes = new ArrayList<>();

        vertexes.add(new Vertex(1));
        vertexes.add(new Vertex(2));
        vertexes.add(new Vertex(3));
        vertexes.add(new Vertex(4));
        vertexes.add(new Vertex(5));
        vertexes.add(new Vertex(6));
        vertexes.add(new Vertex(7));

        vertexes.get(0).addEdge(new Edge(vertexes.get(1), 2));
        vertexes.get(0).addEdge(new Edge(vertexes.get(2), 4));
        vertexes.get(0).addEdge(new Edge(vertexes.get(3), 6));

        vertexes.get(1).addEdge(new Edge(vertexes.get(4), 1));

        vertexes.get(2).addEdge(new Edge(vertexes.get(5), 6));

        vertexes.get(3).addEdge(new Edge(vertexes.get(5), 2));

        vertexes.get(4).addEdge(new Edge(vertexes.get(5), 1));
        vertexes.get(4).addEdge(new Edge(vertexes.get(6), 8));

        vertexes.get(5).addEdge(new Edge(vertexes.get(6), 1));

        return vertexes;
    }

    @Test
    public void findPath() {
        List<Vertex> vertexes = generateVertexes();
        Integer result = DijkstrasАlgorithm.findPath(vertexes.get(0), vertexes.get(6));
        Assert.assertEquals(5, (int)result);
    }
}