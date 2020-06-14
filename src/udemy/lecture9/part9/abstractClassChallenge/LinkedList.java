package udemy.lecture9.part9.abstractClassChallenge;

public class LinkedList {
    private StringListItem head;
    private StringListItem tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addItem(StringListItem newItem) {
        // check whether the list contains new item
        StringListItem item = head;
        while (item != null) {
            if (item.compareTo(newItem) == 0) {
                System.out.println("Cannot add. Duplicates are not allowed");
                return;
            }
            item = (StringListItem) item.getNextItem();
        }

        if (head == null) {
            // move the head to point to the new item
            head = newItem;
            tail = newItem;
        } else if (head.compareTo(newItem) < 0) {
            head.setPreviousItem(newItem);
            newItem.setNextItem(head);
            head = newItem;
        } else if (head.compareTo(newItem) > 0) {
            StringListItem temp = (StringListItem) head.getNextItem();

            while (temp != null) {
                if (newItem.compareTo(temp) > 0) {
                    newItem.setPreviousItem(temp.getPreviousItem());
                    temp.getPreviousItem().setNextItem(newItem);
                    newItem.setNextItem(temp);
                    temp.setPreviousItem(newItem);
                    return;
                } else {
                    temp = (StringListItem) temp.getNextItem();
                }
            }

            tail.setNextItem(newItem);
            newItem.setPreviousItem(tail);
            tail = newItem;
        }
    }

    public void print() {
        StringListItem temp = tail;

        while (temp != null) {
            System.out.println(temp.getValue());
            temp = (StringListItem) temp.getPreviousItem();
        }
    }
}
