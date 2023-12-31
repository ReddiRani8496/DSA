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
        if(root == null) {
            root = new Node(data);
            return;
        }

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

    public void preOrder(Node root) {
        if(root==null)
            return;
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    public void inOrder(Node root) {
        if(root==null)
            return;

        preOrder(root.leftChild);
        System.out.println(root.data);
        preOrder(root.rightChild);
    }
    public void postOrder(Node root) {
        if(root==null)
            return;

        preOrder(root.leftChild);
        preOrder(root.rightChild);
        System.out.println(root.data);
    }

    public int min(Node root) {

        if(root.leftChild == null)
            return root.data;

        return min(root.leftChild);
    }

    public int max(Node root) {
        if(root.rightChild == null)
            return root.data;
        return max(root.rightChild);
    }

    public int height(Node root) {

        if(root==null)
            return 0;

        return 1+Math.max(height(root.leftChild),height(root.rightChild));
    }

    public int noOfLeafNodes(Node root) {
        if(root==null)
            return 0;
        else if(root.leftChild==null && root.rightChild==null)
            return 1;
        else
            return noOfLeafNodes(root.leftChild)+noOfLeafNodes(root.rightChild);
    }

    public int sizeOfTree(Node root) {
        if(root==null)
            return 0;
        return 1+sizeOfTree(root.leftChild)+sizeOfTree(root.rightChild);
    }
}

