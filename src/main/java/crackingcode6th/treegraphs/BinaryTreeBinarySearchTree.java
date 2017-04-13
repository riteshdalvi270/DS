package crackingcode6th.treegraphs;

import assistant.BinaryTreeAssistant;
import objects.Node;

/**
 * Check whether binary tree is binary search tree.
 * @author Ritesh Dalvi (rd026600).
 */
// No right. Looked in the book later.
public class BinaryTreeBinarySearchTree
{
    public static void main(String args[])
    {
        int[] input = new int[] {2, 4, 7, 9, 10, 12, 14};

        final BinaryTreeAssistant<Integer> binaryTreeAssistant = new BinaryTreeAssistant<>();

        final Node<Integer> binarySearchTree = binaryTreeAssistant.createBinarySearchTree(input, 0, input.length - 1);

        System.out.println(isBinaryTreeBinarySearchTree(binarySearchTree, Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    public static boolean isBinaryTreeBinarySearchTree(final Node<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }


        return isLeft(root,min, max);
    }

    public static boolean isLeft(final Node<Integer> node, int min, int max) {

        if(node == null) {
            return false;
        }

        Node<Integer> left = node.getLeftChild();
        Node<Integer> right = node.getRightChild();


        return false;
    }

}
