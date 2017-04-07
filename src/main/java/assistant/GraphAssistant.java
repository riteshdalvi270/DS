package assistant;

import objects.Graph;
import objects.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ritesh on 4/7/17.
 */
public class GraphAssistant<T> {

    final Graph<T> graph;

    private Map<Vertex<T>,List<Vertex<T>>> adj;

    public GraphAssistant(final Graph graph) {
        this.graph = graph;
    }

    public void connectNodes(final T source, final T destination) {

        final Vertex<T> sourceVertex = new Vertex<T>(source);
        final Vertex<T> destVertex = new Vertex<T>(destination);

        final Map<Vertex<T>, List<Vertex<T>>> graph = this.graph.getGraph();

        if(graph ==null) {
            final List<Vertex<T>> neightbors = new ArrayList<>();
            neightbors.add(destVertex);

            adj = new HashMap<>();
            adj.put(sourceVertex,neightbors);

            this.graph.setGraph(adj);
        }else {

            addToExistingGraph(graph,sourceVertex,destVertex);
        }
    }

    public void printGraph(final Graph<T> graph) {

        final Map<Vertex<T>, List<Vertex<T>>> printGraph = graph.getGraph();

        for(Map.Entry<Vertex<T>,List<Vertex<T>>> adj :  printGraph.entrySet()) {

            System.out.print(adj.getKey().getValue());
            System.out.print("---->");

            final List<Vertex<T>> neighbors = adj.getValue();

            for(final Vertex<T> neighbor : neighbors) {

                System.out.print(neighbor.getValue()+", ");
            }
        }
    }

    private void addToExistingGraph(final Map<Vertex<T>, List<Vertex<T>>> graph, final Vertex<T> sourceVertex, final Vertex<T> destVertex) {

        List<Vertex<T>> vertices = graph.get(sourceVertex);

        // if vertext does not exist
        if(vertices == null) {

            vertices = new ArrayList<>();
            vertices.add(destVertex);

            graph.put(sourceVertex,vertices);

            return;
        }

        // if vertex already exist in the graph
        if(vertices.isEmpty()) {
            throw new RuntimeException("Somehow the list is empty");
        }else {
            vertices.add(destVertex);
        }
    }
}
