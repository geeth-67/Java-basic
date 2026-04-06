package Day08.BinaryTrees;


public class BinarySearchTres {

    private Node root;

    public BinarySearchTres() {

        this.root = null;
    }

    public void insert(int value) {

        if (root == null) {
            root = new Node(value);

        }else {
            if (root.data > value) {
                root.left = new Node(value);

            }else if(root.data < value) {
                root.right = new Node(value);
            }
        }

    }
}