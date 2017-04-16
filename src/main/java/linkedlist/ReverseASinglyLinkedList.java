package linkedlist;

import assistant.LinkedListAssistant;
import objects.ListNode;

/**
 * Created by ritesh on 4/15/17.
 */
public class ReverseASinglyLinkedList {

    public static void main(String args[]) {

        Integer[] input = new Integer[] {2,3,4,5,6};

        final LinkedListAssistant<Integer> linkedListAssistant = new LinkedListAssistant<>();
        final ListNode<Integer> linkedList = linkedListAssistant.createLinkedList(input);

        ListNode<Integer> head = reverseALinkedList(linkedList);

        linkedListAssistant.printLinkedList(head);
    }

    public static ListNode<Integer> reverseALinkedList(final ListNode<Integer> listNode) {

        //TODO: left to be implemented
        return null;
    }
}
