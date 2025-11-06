import java.util.Scanner;

public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, bread;
        String customerName;
        int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;

        System.out.println("=== Kafe Cashier System ===");

        do {
            System.out.print("\nInput customer name (type 'cancel' to stop): ");
            customerName = sc.nextLine();

            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction cancelled. Program stopped.");
                break;
            }

            System.out.print("Input number of coffee: ");
            coffee = sc.nextInt();
            System.out.print("Input number of tea: ");
            tea = sc.nextInt();
            System.out.print("Input number of bread: ");
            bread = sc.nextInt();

            int totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);

            System.out.println("Total purchase for " + customerName + " = Rp " + totalPrice);

            sc.nextLine(); 
        } while (true);

        sc.close();
    }
}
