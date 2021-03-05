package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int vertexNumber;
    private List<Edge> edges;

    public Vertex(int vertexNumber) {
        this.vertexNumber = vertexNumber;
        edges = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        edge.setFrom(this);
        edges.add(edge);
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public void setVertexNumber(int vertexNumber) {
        this.vertexNumber = vertexNumber;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
