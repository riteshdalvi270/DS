package crackingcode6th.treegraphs;

import assistant.BinaryTreeAssistant;
import objects.Node;

/**
 * Created by ritesh on 4/8/17.
 */
public class BinarySearchTreeWithMinimalHeight {

    public static void main(String args[]) {

        int input[] = new int[]{2,4,7,9,10,12};

        final Node<Integer> root = createBinarySearchTreeWithMinimalHeight(input,0,input.length -1);

        BinaryTreeAssistant<Integer> binaryTreeAssistant = new BinaryTreeAssistant<>();

        binaryTreeAssistant.printBinaryTree(root);
    }

    public static Node<Integer> createBinarySearchTreeWithMinimalHeight(int input[], int start, int end) {

        if(start > end) {
            return null;
        }

        int pivot = (start+end)/2;

        int element = input[pivot];

        final Node<Integer> treeNode = new Node<>(element,null,null);

        treeNode.setLeftChild(createBinarySearchTreeWithMinimalHeight(input,start,pivot-1));
        treeNode.setRightChild(createBinarySearchTreeWithMinimalHeight(input,pivot+1,end));

        return treeNode;
    }
}
