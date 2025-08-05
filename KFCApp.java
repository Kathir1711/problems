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