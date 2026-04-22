package Day08.BinaryTrees;


public class BinarySearchTres {

    private Node root;

    public BinarySearchTres() {

        this.root = null;
    }

    public void insert(int value) {

        if (root == null) {
            this.root = new Node(value);
        }

        if (root.data > value) {
            root.left = new Node(value);
        }

        if(root.data < value) {
            root.right = new Node(value);
        }
    }
}