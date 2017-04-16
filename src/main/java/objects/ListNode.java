package objects;

/**
 * Created by ritesh on 4/15/17.
 */
public class ListNode<T> {

    T value;
    ListNode next;

    public ListNode(T value) {
        this.value = value;
        next = null;
    }

    public ListNode() {

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}
