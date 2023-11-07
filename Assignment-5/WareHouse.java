import java.util.Hashtable;

// Warehouse class implements IOrder
class WareHouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    public WareHouse(String address) {
        this.address = address;
        stock = new Hashtable<>();
    }

    public void addStock(Item item, int quantity) {
        stock.put(item.sku, quantity);
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            if (stock.containsKey(item.sku) && stock.get(item.sku) > 0) {
                stock.put(item.sku, stock.get(item.sku) - 1);
                System.out.println("Fulfilled order for SKU: " + item.sku + " from Warehouse at " + address);
            } else {
                System.out.println("SKU: " + item.sku + " is out of stock in Warehouse at " + address);
            }
        }
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.sku))
            return stock.get(item.sku);
        return 0;
    }
}
