import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){

}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Painting", 500, "Made by Anna"));
        storeProducts.add(new ArtObject("Sculpture", 1200,
                "Made by Peter"));
        storeProducts.add(new Furniture("Sofa", 2000,
                "Living Room"));
        storeProducts.add(new Furniture("Chair", 600,
                "Office"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts(){
        for(var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex))); //new record
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty()); //product comes from record, printpricedItem - from abstract
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }
}

