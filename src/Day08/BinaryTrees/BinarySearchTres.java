package Day08.BinaryTrees;


public class BinarySearchTres {

    private Node root;

    public BinarySearchTres() {

        this.root = null;
    }

    // without recursive mode
//    public void insert(int value) {
//
//        if (root == null) {
//            this.root = new Node(value);
//        }
//
//        if (root.data > value) {
//            root.left = new Node(value);
//        }
//
//        if(root.data < value) {
//            root.right = new Node(value);
//        }
//    }


    // recursive mode
    public void insert(int value) {

        root = insertHelper(root , value);
    }

    private Node insertHelper(Node node , int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.left = insertHelper(node.left , value);

        }else if (value > node.data) {
            node.right = insertHelper(node.right , value);
        }

        return node;
    }
}