package crackingcode6th.treegraphs;

import assistant.GraphAssistant;
import objects.Graph;
import objects.Vertex;

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

        System.out.print(routeBetweenNodes(graph));
    }

    public static boolean routeBetweenNodes(final Graph<String> graph) {

        
    }
}
