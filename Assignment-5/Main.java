
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WareHouse warehouse1 = new WareHouse("Warehouse 1");
        WareHouse warehouse2 = new WareHouse("Warehouse 2");

        warehouse1.addStock(new Item("SKU1"), 10);
        warehouse2.addStock(new Item("SKU2"), 5);

        List<WareHouse> warehouses = List.of(warehouse1, warehouse2);
        OrderFulfillment orderFulfillment = new OrderFulfillment(warehouses);

        Order order = new Order(List.of(new Item("SKU1"), new Item("SKU2"), new Item("SKU3")));

        orderFulfillment.fulfillOrder(order);
    }
}
