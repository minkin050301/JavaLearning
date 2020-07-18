package udemy.lecture12.collections.part20.sortedCollections;

public class MainChallenge {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 8, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.5, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.5, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.26, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
        System.out.println("=============");

        Basket basket = new Basket("Marques");
        StockItem item = stockList.get("vase");
        basket.addToBasket(item, 10);
        basket.addToBasket(stockList.get("phone"), 5);
        System.out.println(basket);
        System.out.println("--------------");
        System.out.println(stockList);

        basket.unreserve(stockList.get("phone"), 4);
        System.out.println(basket.unreserve(stockList.get("door")));
        System.out.println(basket);
        basket.checkout();
        System.out.println(basket);
        System.out.println(stockList);
    }
}
