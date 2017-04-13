package crackingcode6th.treegraphs;

import assistant.BinaryTreeAssistant;
import objects.Node;

/**
 * Check whether binary tree is binary search tree.
 * @author Ritesh Dalvi (rd026600).
 */
public class BinaryTreeBinarySearchTree
{
    public static void main(String args[])
    {
        int[] input = new int[] {2, 4, 7, 9, 10, 12, 14};

        final BinaryTreeAssistant<Integer> binaryTreeAssistant = new BinaryTreeAssistant<>();

        final Node<Integer> binarySearchTree = binaryTreeAssistant.createBinarySearchTree(input, 0, input.length - 1);

        System.out.println(isBinaryTreeBinarySearchTree(binarySearchTree));
    }

    public static boolean isBinaryTreeBinarySearchTree(final Node<Integer> binaryTree)
    {
        if (binaryTree == null)
        {
            return true;
        }

        determineBinaryTeeBinarySearchTree(binaryTree.getLeftChild())
                && determineBinaryTeeBinarySearchTree(binaryTree.getRightChild());

        if (value)
        {
            return isBinaryTreeBinarySearchTree(binaryTree.getLeftChild()) && isBinaryTreeBinarySearchTree(binaryTree.getRightChild());
        }

        return false;
    }

    public static Node determineBinaryTeeBinarySearchTree(final Node<Integer> node)
    {
        if (node == null)
        {
            return null;
        }

        int value = node.getValue();
        determineBinaryTeeBinarySearchTree(node.getLeftChild());
        determineBinaryTeeBinarySearchTree(node.getRightChild());
    }
}
