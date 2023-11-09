public class Tree {
    private class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return  Integer.toString(data);
        }
    }

    public Node root;

    public void insert(int data) {
        if(root == null) {
            root = new Node(data);
            return;
        }
        var current = root;
        while (true) {
            if(data < current.data) {
                if(current.leftChild==null) {
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

    public boolean find (int data) {
//        if(root == null)
//            return false;
        var current = root;
        while (current!=null) {
            if(current.data == data)
                return true;
            else if(data < current.data)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        return false;
    }

    public void preOrder(Node root) {
        if(root == null)
            return;
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    public void postOrder(Node root) {
        if(root == null)
            return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.data);
    }

    public void inOrder(Node root) {
        if(root == null)
            return;
        inOrder(root.leftChild);
        System.out.println(root.data);
        inOrder(root.rightChild);
    }

    public int max(Node root) {
        if (root.rightChild == null)
            return root.data;
        return max(root.rightChild);
    }

    public int min(Node root) {
        if(root.leftChild == null)
            return root.data;
        return min(root.leftChild);
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

    public void nodesAtKDistance(Node root, int distance) {
        if(root == null)
            return;
        if(distance == 0) {
            System.out.println(root.data);
            return;
        }
        nodesAtKDistance(root.leftChild,distance-1);
        nodesAtKDistance(root.rightChild,distance-1);
    }

    public boolean isIdentical(Node tree1,Node tree2) {
        if(tree1 == null && tree2==null)
            return true;
        if(tree1!=null && tree2 != null)
            return (tree1.data == tree2.data) && isIdentical(tree1.leftChild,tree2.leftChild) && isIdentical(tree1.rightChild,tree2.rightChild);
        return false;
    }

    public boolean isMirror(Node tree1, Node tree2) {
        if(tree1 == null && tree2==null)
            return  true;
        if(tree1 != null && tree2 != null)
            return tree1.data == tree2.data && isMirror(tree1.leftChild,tree2.rightChild) && isMirror(tree1.rightChild,tree2.leftChild);
        return false;
    }
}

