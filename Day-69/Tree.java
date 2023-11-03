public class Tree {
    private class Node {
        int data;
        Node rightChild;
        Node leftChild;
        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }
    Node root;
    public void insert(int data) {
        if(root == null)
            root = new Node(data);

        var current = root;

        while (true) {
            if(data < current.data) {
                if(current.leftChild == null) {
                    current.leftChild = new Node(data);
                    break;
                }
                current = current.leftChild;
            } else {
                if(current.rightChild == null) {
                    current.rightChild = new Node(data);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int data) {
        var current = root;
        while (current != null) {
            if(current.data == data)
                return true;
            else if(current.data > data)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        return false;
    }
}
