package crackingcode6th.treegraphs;

import assistant.BinaryTreeAssistant;
import objects.Node;

/**
 * Created by ritesh on 4/13/17.
 */
public class FindCommonAncestor {

    public static void main(String args[]) {

        int[] input = new int[]{0,1,2,3,4,5,6,7,8};

        final BinaryTreeAssistant<Integer> binaryTreeAssistant = new BinaryTreeAssistant<>();

        final Node<Integer> tree = binaryTreeAssistant.createBinarySearchTree(input, 0, input.length - 1);

        final Node<Integer> successor = findCommonAncestor(tree,new Node<>(1,null,null), new Node<>(3,null,null));

        System.out.println(successor.getValue());
    }

    public static Node<Integer> findCommonAncestor(final Node<Integer> root, final Node<Integer> node1, final Node<Integer> node2) {

        if(node1 == null) {
            return root;
        }

        if(node2 == null) {
            return root;
        }

        return ancestorHelper(root,node1,node2);
    }

    public static boolean covers(final Node<Integer> root, final Node<Integer> node2){

        if(root == null) {
            return false;
        }

        if(root.equals(node2)) {
            return true;
        }

        return covers(root.getLeftChild(),node2) || covers(root.getRightChild(),node2);
    }

    public static Node<Integer> ancestorHelper(final Node<Integer> root, final Node<Integer> node1, final Node<Integer> node2) {

        if(root == null) {
            return null;
        }

        boolean isPonLeft = covers(root,node1);
        boolean isQonLeft = covers(root,node2);

        if(isPonLeft && isQonLeft) {
            return ancestorHelper(root.getLeftChild(),node1,node2);
        }else if(!isPonLeft && !isQonLeft)  {
            return ancestorHelper(root.getRightChild(),node1,node2);
        }

        return root;
    }
}