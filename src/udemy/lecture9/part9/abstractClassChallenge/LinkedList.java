package udemy.lecture9.part9.abstractClassChallenge;

import java.sql.SQLOutput;

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

    public void removeItem(String value) {
        StringListItem item = head;
        while (item != null) {
            if (item.getValue().equals(value) && item == head) {
                head = (StringListItem) item.getNextItem();
                item.getNextItem().setPreviousItem(null);
                return;
            } else if (item.getValue().equals(value) && item == tail) {
                tail = (StringListItem) item.getPreviousItem();
                item.getPreviousItem().setNextItem(null);
                return;
            } else if (item.getValue().equals(value)) {
                item.getPreviousItem().setNextItem(item.getNextItem());
                item.getNextItem().setPreviousItem(item.getPreviousItem());
                return;
            }

            item = (StringListItem) item.getNextItem();
        }

        System.out.println("Item not found");
    }
}
