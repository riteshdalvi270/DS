package assistant;

import objects.ListNode;

/**
 * Created by ritesh on 4/15/17.
 */
public class LinkedListAssistant<T> {

    public ListNode<T> createLinkedList(T[] array) {

        ListNode<T> head = null;
        ListNode<T> p1 = null;

        for(T value : array) {

            if(head == null) {

                head = new ListNode<>(value);
                p1 = head;
            }else {
                final ListNode<T> newNode = new ListNode<>(value);
                p1.setNext(newNode);
                p1 = p1.getNext();
            }
        }

        return head;
    }

    public void printLinkedList(ListNode<T> head) {

        ListNode<T> listNode = head;

        while(listNode.getNext()!=null) {
            System.out.println(listNode.getValue());
        }
    }
}
