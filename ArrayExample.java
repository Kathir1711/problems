import java.util.Scanner;

public class ChocolateBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the chocolate bar: ");
        int size = scanner.nextInt();

        int[] chocolateBar = new int[size];
        System.out.println("Enter the sweetness values for each position:");

        for (int i = 0; i < size; i++) {
            System.out.print("Position " + (i + 1) + ": ");
            chocolateBar[i] = scanner.nextInt();
        }

        System.out.println("Chocolate Bar:");

        for (int i = 0; i < size; i++) {
            System.out.print(chocolateBar[i] + " ");
        }

        scanner.close();
    }
}
