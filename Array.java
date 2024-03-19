import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers, separated by spaces:");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scan.nextDouble();
        }

        // Find the maximum number in the array
        double max = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + max);
    }
}