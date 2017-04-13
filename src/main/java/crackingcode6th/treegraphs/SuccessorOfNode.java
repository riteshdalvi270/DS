package crackingcode6th.treegraphs;

/**
 * Find the successor of the node.
 * Created by ritesh on 4/13/17.
 */
public class SuccessorOfNode {

    public static void main(String args[]) {

        Node node = new Node();

        findSuccessor(node);

    }

    public static Node findSuccessor(Node node) {

        if(node == null) {
            return null;
        }

        Node x = null;
       if(node.getRight()!=null) {
          x  = treeMinimun(node.getRight());
       }
        
    }

    public static Node treeMinimun(Node left) {
        while(left.getLeft()!=null) {

            left = left.getLeft();
        }

        return left;
    }

    static class Node {

        int value;
        Node left;
        Node right;
        Node parent;

        public int getValue() {
            return value;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }
    }
}
