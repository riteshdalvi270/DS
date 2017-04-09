package crackingcode6th.treegraphs;

import assistant.BinaryTreeAssistant;
import objects.Node;

import java.util.*;

/**
 * Created by ritesh on 4/9/17.
 */
public class NodeAtEachDepth {

    public static void main(String args[]) {

        final int[] input = new int[] {2,4,7,9,10,12,14};

        final BinaryTreeAssistant binaryTreeAssistant = new BinaryTreeAssistant();
        final Node<Integer> root = binaryTreeAssistant.<Integer>createBinarySearchTree(input, 0, input.length - 1);

        final Map<Integer,List<Integer>> nodesAtEachDept = new HashMap<>();

        Collection<List<Integer>> lists = depthAtEachNode(root, 0, nodesAtEachDept);

        int depth = 0;

        for(final List<Integer> children : lists) {

            System.out.println("Depth: "+depth++);
            for(final Integer child : children) {

                System.out.println(child);
            }
        }

    }

    private static Collection<List<Integer>> depthAtEachNode(final Node<Integer> root, int depth, Map<Integer,List<Integer>> nodesAtEachDepth) {

        if(root ==null) {
            return nodesAtEachDepth.values();
        }

        final List<Integer> nodes = nodesAtEachDepth.get(depth);

        if(nodes == null) {
            final List<Integer> children = new ArrayList<>();
            children.add(root.getValue());

            nodesAtEachDepth.put(depth,children);
        }else {

            nodes.add(root.getValue());
            nodesAtEachDepth.put(depth,nodes);
        }

        depthAtEachNode(root.getLeftChild(),depth+1, nodesAtEachDepth);
        depthAtEachNode(root.getRightChild(),depth+ 1, nodesAtEachDepth);

        return nodesAtEachDepth.values();
    }
}
