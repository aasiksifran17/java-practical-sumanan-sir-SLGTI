import java.util.Scanner;

public class primenumber
 {
    public static void main(String[] args) 
    {
        Scanner prime = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = prime.nextInt();

        if (number % 100 == 0)
         {
            System.out.println(number + " is a multiple ");
        }
         else
         {
            System.out.println(number + " is not a multiple");
        }
    }
}
