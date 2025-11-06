import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type, duration, total = 0, i = 1;

        System.out.println("===Parking System===");
        System.out.println("Type: 1 = Car, 2 = Motorcycle, 0 = Exit");

        do {
            System.out.print("Enter vehicle type (1/2/0 to exit): ");
            type = sc.nextInt();

            if (type == 0) {
                break;
            } else if (type != 1 && type != 2) {
                System.out.println("Invalid vechile type! Try again.\n");
                continue;
            }

            System.out.println("Enter duration parking (hours): ");
            duration = sc.nextInt();

            if (duration > 5) {
                total += 12500;
            } else if (type == 1) {
                total += duration * 3000;
            } else if (type == 2) {
                total += duration * 2000;
            }
            i++;

        } while (true);

        System.out.println("Total parking fee: Rp " + total);
        sc.close();
    }
    }

