package crackingcode6th.treegraphs;

import assistant.BinaryTreeAssistant;
import objects.Node;

/**
 * Created by ritesh on 4/15/17.
 */
public class KthSmallestElement {

    public static void main(String args[]) {

        int[] input = new int[]{2,4,6,7,9,10,14,16,19};

        final BinaryTreeAssistant<Integer> binaryTreeAssistant = new BinaryTreeAssistant<>();
        Node<Integer> root = binaryTreeAssistant.createBinarySearchTree(input, 0, input.length - 1);

        System.out.println(kthSmallest(root,3));
    }

    // not possible using recursive, think about iterative.
    public static int kthSmallest(final Node<Integer> root, int k) {

        if(root == null) {
            return 0;
        }

        int min1 = kthSmallest(root.getLeftChild(),k--);

        int min2 = kthSmallest(root.getRightChild(),k--);

        if(k == 0) {
            return Math.min(min1,min2);
        }

        int min = Math.max(min1,min2);

        if(root.getValue() > min) {
            min = root.getValue();
        }

        return min;
    }
}
