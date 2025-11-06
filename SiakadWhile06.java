import java.util.Scanner;

public class SiakadWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade, total, i = 0;

        System.out.print("Input number of students: ");
        total = sc.nextInt();

        while (i < total) {
            System.out.print("Input grade: ");
            grade = sc.nextInt();

           
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade! Please re-enter.");
                continue; 
            }

           
            if (grade > 80 && grade <= 100) {
                System.out.println("Grade = A");
                System.out.println("Good, keep the grade!"); 
            } else if (grade > 73 && grade <= 80) {
                System.out.println("Grade = B+");
            } else if (grade > 65 && grade <= 73) {
                System.out.println("Grade = B");
            } else if (grade > 60 && grade <= 65) {
                System.out.println("Grade = C+");
            } else if (grade > 50 && grade <= 60) {
                System.out.println("Grade = C");
            } else if (grade > 39 && grade <= 50) {
                System.out.println("Grade = D");
            } else {
                System.out.println("Grade = E");
            }

            i++; 
        }

        sc.close();
    }
}
