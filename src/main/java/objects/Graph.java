package objects;

import java.util.List;
import java.util.Map;

/**
 * Created by ritesh on 4/7/17.
 */
public class Graph<T> {

    Map<Vertex<T>,List<Vertex<T>>> graph;

    public Graph() {

    }

    public Map<Vertex<T>,List<Vertex<T>>> getGraph() {
        return graph;
    }

    public void setGraph(final Map<Vertex<T>,List<Vertex<T>>> graph) {
        this.graph = graph;
    }
}
