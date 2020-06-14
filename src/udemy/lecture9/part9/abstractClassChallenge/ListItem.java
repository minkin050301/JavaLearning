package udemy.lecture9.part9.abstractClassChallenge;

public abstract class ListItem {
    private Object value;
    private ListItem nextItem;
    private ListItem previousItem;

    public ListItem(Object value) {
        this.value = value;
        this.nextItem = null;
        this.previousItem = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    public abstract int compareTo(ListItem listItem);
}
