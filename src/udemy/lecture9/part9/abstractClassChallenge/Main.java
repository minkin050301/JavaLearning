package udemy.lecture9.part9.abstractClassChallenge;

public class Main {
    public static void main(String[] args) {
//        LinkedList testList = new LinkedList();
//        testList.addItem(new StringListItem("Valera"));
//        testList.addItem(new StringListItem("Markus"));
//        testList.addItem(new StringListItem("Anna"));
//        testList.addItem(new StringListItem("Borrow"));
//        testList.addItem(new StringListItem("Elderly frog"));
//        testList.addItem(new StringListItem("Markus"));
//        testList.print();
//        System.out.println();
//        testList.removeItem("Anna");
//        testList.print();
//        System.out.println();
//        testList.addItem(new StringListItem("Anastasia"));
//        testList.addItem(new StringListItem("Zeus"));
//        testList.print();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.addItem("Cock");
        binarySearchTree.addItem("Valera");
        binarySearchTree.addItem("Markus");
        binarySearchTree.addItem("Bob");
        binarySearchTree.addItem("Sylvia");
        binarySearchTree.addItem("Robert");
        binarySearchTree.addItem("Anna");
        binarySearchTree.inOrderTraverse(binarySearchTree.getRoot());
    }
}
