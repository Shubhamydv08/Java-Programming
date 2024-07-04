package tree;

public class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
    }
}
