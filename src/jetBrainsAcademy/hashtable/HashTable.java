package jetBrainsAcademy.hashtable;

public class HashTable<T> {

    private final int size;
    private TableEntry<T>[] table;

    public HashTable(int size) {
        this.size = size;
        table = new TableEntry[size];
    }

    private int findEntryIndex(int key) {
        int hash = key % size;

        while (!(table[hash] == null || table[hash].getKey() == key)) {
            hash = (hash + 1) % size;

            if (hash == key % size) {
                return -1;
            }
        }

        return hash;
    }

    public boolean put(int key, T value) {
        int idx = findEntryIndex(key);

        if (idx == -1) {
            return false;
        }

        table[idx] = new TableEntry(key, value);
        return true;
    }

    public T get(int key) {
        int idx = findEntryIndex(key);

        if (idx == -1 || table[idx] == null) {
            return null;
        }

        return table[idx].getValue();
    }

    @Override
    public String toString() {
        StringBuilder tableSB = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                tableSB.append(i).append(": null");
            } else {
                tableSB.append(i).append(": key=").append(table[i].getKey())
                        .append(", value=").append(table[i].getValue());
            }

            if (i < table.length - 1) {
                tableSB.append("\n");
            }
        }

        return tableSB.toString();
    }
}
