package objects;

import java.util.Objects;

/**
 * Created by ritesh on 4/7/17.
 */
public class Node<T> {

    T value;
    Node<T> leftChild;
    Node<T> rightChild;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Node(final T value, Node<T> leftChild, Node<T> rightChild) {

        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public boolean equals(Object o) {

        if(o == this) {
            return true;
        }

        if(!(o instanceof Node)) {
            return false;
        }

        Node node = (Node) o;

        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
