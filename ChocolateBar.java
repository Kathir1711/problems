import java.util.Scanner;

public class ChocolateBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the chocolate bar
        System.out.print("Enter the size of the chocolate bar: ");
        int size = scanner.nextInt();

        // Input the sweetness values for each position in the chocolate bar
        int[] chocolateBar = new int[size];
        System.out.println("Enter the sweetness values for each position:");

        for (int i = 0; i < size; i++) {
            System.out.print("Position " + (i + 1) + ": ");
            chocolateBar[i] = scanner.nextInt();
        }

        // Output the chocolate bar
        System.out.println("Chocolate Bar:");

        for (int i = 0; i < size; i++) {
            System.out.print(chocolateBar[i] + " ");
        }

        scanner.close();
    }
}
