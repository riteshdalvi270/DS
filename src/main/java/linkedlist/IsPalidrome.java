package linkedlist;

import assistant.LinkedListAssistant;
import objects.ListNode;

/**
 * Created by ritesh on 4/15/17.
 */
public class IsPalidrome {

    public static void main(String args[]) {

        Character[] values1 = new Character[] {'a', 'b', 'u', 't','t', 'u','b','a'};

        Character[] values2 = new Character[] {'d','a','d'};

        Character[] values3 = new Character[] {'f','a','d'};


        final LinkedListAssistant<Character> linkedListAssistant = new LinkedListAssistant<>();

        ListNode<Character> head = linkedListAssistant.createLinkedList(values3);

        System.out.println(isPalidrome(head));
    }

    public static boolean isPalidrome(final ListNode<Character> head) {

        ListNode<Character> p1 = head;
        ListNode<Character> p2 = p1;
        ListNode<Character> p3 = p1.getNext();

        while(p2.getNext()!=null) {
            p2 = p2.getNext();
        }

        if(p1.getValue() != p2.getValue()) {
            return false;
        }

        while( (p3.getValue()!=p1.getValue() || p3.getValue()!=p2.getValue()) && p3.getNext()!=null) {

            while(p3.getNext() != p2) {

                p3 = p3.getNext();
            }

            p2 = p3;
            p1 = p1.getNext();

            if(p1.getValue() != p2.getValue()) {
                return false;
            }

            p3 = p1.getNext();
        }

        return true;
    }
}
