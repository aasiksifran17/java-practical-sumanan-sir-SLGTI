import java.util.Scanner;

public class marks
 {
    public static void main(String[] args)
     {
        Scanner Aasik = new Scanner(System.in);

        System.out.println("Tamil Marks: ");
        double Tamil = Aasik.nextDouble();

        System.out.println("English Marks: ");
        double English = Aasik.nextDouble();

         System.out.println("ICT Marks: ");
        double ICT = Aasik.nextDouble();

         System.out.println("Islam Marks: ");
        double Islam = Aasik.nextDouble();

         System.out.println("Sinhala Marks: ");
        double Sinhala = Aasik.nextDouble();

         System.out.println("Maths Marks: ");
        double Maths = Aasik.nextDouble();

        double Total=(English+ICT+Islam+Sinhala+Maths);
        double Average=Total/6;
        System.out.println("Calculate Average: " + Average);
    }
}




