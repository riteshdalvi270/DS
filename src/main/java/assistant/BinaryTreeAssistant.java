package assistant;

import objects.Node;

/**
 * Created by ritesh on 4/8/17.
 */
public class BinaryTreeAssistant<T> {

    public void printBinaryTree(final Node<T> root) {

        if(root == null) {
            return;
        }

        System.out.print(root.getValue());
        printBinaryTree(root.getLeftChild());
        printBinaryTree(root.getRightChild());

        System.out.println();
    }

    public Node<Integer> createBinarySearchTree(int input[], int start, int end) {

        if(start > end) {
            return null;
        }

        int pivot = (start+end)/2;

        int element = input[pivot];

        final Node<Integer> treeNode = new Node<>(element,null,null);

        treeNode.setLeftChild(createBinarySearchTree(input,start,pivot-1));
        treeNode.setRightChild(createBinarySearchTree(input,pivot+1,end));

        return treeNode;
    }
}
