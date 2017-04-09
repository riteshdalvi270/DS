package objects;

import java.util.Objects;

/**
 * Created by ritesh on 4/7/17.
 */

public class Vertex<T> {
    T value;
    boolean visited;

    public Vertex(final T value) {
        this.value = value;
        visited = false;
    }

    public T getValue() {
        return value;
    }

    public void setVisited(final boolean visited) {
        this.visited = visited;
    }

    public boolean getVisited() {
        return visited;
    }

    @Override
    public boolean equals(Object o) {

        if(o == this) {
            return true;
        }

        if(!(o instanceof Vertex)) {
            return false;
        }

        Vertex vertex = (Vertex) o;

        return value == vertex.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
