package tree;

public class Bst {
    static class Node{
        int data ;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }
    }
        public static Node insert(Node root, int val){
            if (root==null){
                root = new Node(val);
                return root;
            }
            if(root.data>val){
                root.left = insert(root.left,val);
            }else{
                root.right = insert(root.right,val);
            }
            return root;
        }
        //Inorder Treaversal(Printing)
        public static void inorder(Node root) {
            if (root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }

    public static void preorder(Node root) {
        if (root==null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
    public static void main(String[] args) {
        int [] values ={5,1,3,4,2,7};
        Node root= null;
        for (int i = 0; i < values.length; i++) {
            root= insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        minimum(root);
        System.out.println(min);
        maximum(root);
        System.out.println(max);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();

    }
    static int min = Integer.MAX_VALUE;
    public static void minimum(Node root) {
        if(root == null) return;
        if (root.data < min){
            min = root.data;
        }
        minimum(root.left);
        minimum(root.right);
    }
    static int max = Integer.MIN_VALUE;
    public static void maximum(Node root) {
        if(root == null) return;
        if (root.data > max){
            max = root.data;
        }
        maximum(root.left);
        maximum(root.right);
    }
}
