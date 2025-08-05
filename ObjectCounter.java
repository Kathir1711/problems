public class ObjectCounter {
    // Static variable to keep track of the count
    private static int objectCount = 0;

    // Constructor increments the count each time an object is created
    public ObjectCounter() {
        objectCount++;
    }

    // Method to get the count of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Create objects of the class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();


        // Print the count of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}
