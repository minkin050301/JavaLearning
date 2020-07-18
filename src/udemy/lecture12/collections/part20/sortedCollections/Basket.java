package udemy.lecture12.collections.part20.sortedCollections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public boolean addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0 && quantity <= item.quantityAvailableInStock()) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return item.reserve(quantity);
        }
        return false;
    }

    public boolean unreserve(StockItem item) {
        if (item != null) {
            int inBasket = list.getOrDefault(item, 0);
            if (inBasket != 0) {
                list.remove(item);
                item.unreserve(inBasket);
                return true;
            }
        }
        return false;
    }

    public boolean unreserve(StockItem item, int quantity) {
        if (item != null) {
            int inBasket = list.getOrDefault(item, 0);
            if (inBasket != 0 && quantity <= inBasket) {
                list.put(item, inBasket - quantity);
                item.unreserve(quantity);
                return true;
            }
        }
        return false;
    }

    public boolean checkout() {
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            item.getKey().purchase();
        }
        list.clear();
        return true;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + (list.size() == 1 ? " item\n" : " items\n");
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " to purchase \n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost: " + totalCost;
    }
}
