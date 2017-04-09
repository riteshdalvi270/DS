package crackingcode6th.treegraphs;

import assistant.GraphAssistant;
import objects.Graph;
import objects.Vertex;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by ritesh on 4/7/17.
 */
public class RouteBetweenNodes
{
    public static void main(String args[]) {

        final Graph<String> graph = new Graph<>();

        GraphAssistant graphAssistant = new GraphAssistant(graph);
        graphAssistant.connectNodes("A", "B");
        graphAssistant.connectNodes("B", "D");
        graphAssistant.connectNodes("D", "F");


        graphAssistant.connectNodes("A","C");
        graphAssistant.connectNodes("C","E");
        graphAssistant.connectNodes("E", "F");


        graphAssistant.printGraph(graph);

        System.out.println();

        System.out.print(routeBetweenNodes(graph, "A", "G"));
    }

    public static boolean routeBetweenNodes(final Graph<String> graph, final String source, final String destination) {

        final Vertex<String> sourceVertex = new Vertex<>(source);
        sourceVertex.setVisited(true);

        final Vertex<String> destVertex = new Vertex<>(destination);

        Map<Vertex<String>, List<Vertex<String>>> adj = graph.getGraph();

        final Queue<Vertex> queue = new ArrayDeque<>();
        queue.add(sourceVertex);

        while(!queue.isEmpty()) {

            final Vertex startVertex = queue.remove();

            final List<Vertex<String>> neighbors = adj.get(startVertex);

            if(neighbors == null) {
                continue;
            }

            for(final Vertex<String> vertices:neighbors) {

                if(vertices.getVisited()) {
                    continue;
                }

                if(vertices.equals(destVertex)) {
                    return true;
                }

                vertices.setVisited(true);

                queue.add(vertices);
            }
        }

        return false;
    }
}
