package nest;

import assistant.BinaryTreeAssistant;
import objects.Node;

/**
 * Created by ritesh on 4/8/17.
 */
public class SumFromRootToLeaf {

    public static void main(String args[]) {

        int sum = 20;

        int input[] = new int[]{2,4,7,9,10,12,14};

        final Node<Integer> binarySearchTree = new BinaryTreeAssistant<Integer>().createBinarySearchTree(input, 0, input.length - 1);

        System.out.println(sumFromRootToLeaf(binarySearchTree,sum, 0));
    }

    public static boolean sumFromRootToLeaf(final Node<Integer> root, final int sum, int sumUptoLeaf) {

        if(root == null) {

            if(sumUptoLeaf == sum) {
                return true;
            }

            return false;
        }

        sumUptoLeaf = sumUptoLeaf + root.getValue();

        return sumFromRootToLeaf(root.getLeftChild(),sum,sumUptoLeaf) || sumFromRootToLeaf(root.getRightChild(),sum,sumUptoLeaf);
    }
}
