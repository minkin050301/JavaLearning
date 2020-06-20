package udemy.lecture9.binarySearchTree;

public class BinaryTree {
    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preorderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;

        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null) {
                return null;
            }
        }

        return focusNode;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(50, "Boss");
        binaryTree.addNode(25, "VP");
        binaryTree.addNode(15, "Office Manager");
        binaryTree.addNode(30, "Secretary");
        binaryTree.addNode(75, "Sales Manager");
        binaryTree.addNode(85, "Salesman");

        binaryTree.inOrderTraverseTree(binaryTree.root);
        binaryTree.preorderTraverseTree(binaryTree.root);
        System.out.println(binaryTree.findNode(30));
    }
}

class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + " has a key " + key;
    }
}

