package Practice;
import java.util.Scanner;
public class ScMultiply {
    public static void main (String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second  number : ");
        int b = sc.nextInt();

        int multiply = a*b;
        System.out.println("Value of A -> "+a);
        System.out.println("Value of B -> "+b);
        System.out.println("Value of A x B ->"+multiply);
    }
}
