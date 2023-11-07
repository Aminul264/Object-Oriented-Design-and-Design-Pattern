import java.util.List;

// OrderFulfillment class also implements IOrder
class OrderFulfillment implements IOrder {
    private List<WareHouse> WareHouses;

    public OrderFulfillment(List<WareHouse> WareHouses) {
        this.WareHouses = WareHouses;
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            for (WareHouse WareHouse : WareHouses) {
                if (WareHouse.currentInventory(item) > 0) {
                    WareHouse.fulfillOrder(new Order(List.of(item)));
                    break;
                }
            }
        }
    }
}
