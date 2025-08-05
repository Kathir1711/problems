import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class KFCApp {
    public static void main(String[] args) {
        MenuItem chickenBucket = new MenuItem("Chicken Bucket", 15.99);
        MenuItem fries = new MenuItem("Fries", 3.99);
        MenuItem soda = new MenuItem("Soda", 1.99);

        Order customerOrder = new Order();
        customerOrder.addItem(chickenBucket);
        customerOrder.addItem(fries);
        customerOrder.addItem(soda);

        System.out.println("Order items:");
        for (MenuItem item : customerOrder.getItems()) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }

        System.out.println("\nTotal: $" + customerOrder.calculateTotal());
    }
}
