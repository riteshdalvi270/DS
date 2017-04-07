package objects;

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
}
