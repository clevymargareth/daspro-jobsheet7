import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int customers, ticketCount, totalTicketSold = 0, i = 0;
        double ticketPrice = 50000, totalPrice = 0, totalSales = 0, discount;

        System.out.print("Enter the number of customers: ");
        customers = sc.nextInt();

        while (i < customers) {
            System.out.print("Enter the numbers of tickets bought by customers " + (i + 1) + ": ");
            ticketCount = sc.nextInt();

            if (ticketCount < 0) {
                System.out.println("Invalid input. Please enter a posistive number!");
                continue;
            }
            totalPrice = ticketPrice * ticketCount;

            if (ticketCount > 10) {
                discount = 0.15;
            } else if (ticketCount > 4) {
                discount = 0.1;
            } else {
                discount = 0;
            }

            totalPrice -= totalPrice * discount;

            System.out.println("Total price for customer " + (i + 1) + ": Rp" + totalPrice);
            totalSales += totalPrice;
            totalTicketSold += ticketCount;

            i++;
        }
        System.out.println("\n----DAILY SALES REPORT----");
        System.out.println("Total ticket sold: " + totalTicketSold);
        System.out.println("Total sales: Rp" + totalSales);

        sc.close();

    }

}
