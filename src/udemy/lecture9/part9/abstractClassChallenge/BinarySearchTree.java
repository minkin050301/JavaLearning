package udemy.lecture9.part9.abstractClassChallenge;

public class BinarySearchTree {
    private StringListItem root;

    public StringListItem getRoot() {
        return root;
    }

    public void addItem(String value) {
        StringListItem newNode = new StringListItem(value);
        if (root == null) {
            root = newNode; // if root is null, set it to the new node
        } else {
            StringListItem focusNode = root;
            StringListItem parent;

            while (true) {
                parent = focusNode;
                if (focusNode.compareTo(newNode) > 0) {
                    focusNode = (StringListItem) focusNode.getPreviousItem();

                    if (focusNode == null) {
                        parent.setPreviousItem(newNode);
                        return;
                    }
                } else {
                    focusNode = (StringListItem) focusNode.getNextItem();

                    if (focusNode == null) {
                        parent.setNextItem(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverse(StringListItem focusNode) {
        if (focusNode != null) {
            inOrderTraverse((StringListItem) focusNode.getPreviousItem());
            System.out.println(focusNode);
            inOrderTraverse((StringListItem) focusNode.getNextItem());
        }
    }
}
