package objects;

/**
 * Created by ritesh on 4/7/17.
 */
public class Node<T> {

    T value;

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

    Node<T> leftChild;
    Node<T> rightChild;

    public Node(final T value, Node<T> leftChild, Node<T> rightChild) {

        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
