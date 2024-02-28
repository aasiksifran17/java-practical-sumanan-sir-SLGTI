import java.util.Scanner;

public class main {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 0 && number < 30) {
            System.out.println("total: " + number * 8);

        } else if (number >= 30 && number < 60) {
            System.out.println("total: " + number * 10);

        } else if (number >= 60 && number < 90) {
            System.out.println("total: " + number * 12);

        } else if (number >= 90 && number < 120) {
            System.out.println("total: " + number * 13);

        } else if (number >= 120) {
            System.out.println("total: " + number * 15);

        } else {
            System.out.println("output.");
        }
    }
}