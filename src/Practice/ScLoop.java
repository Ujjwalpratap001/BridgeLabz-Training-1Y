package Practice;
import java.util.Scanner;
// take a number as input and print the loop upto that number
public class ScLoop {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();

        for(int i=1;i<=n; i++) {
            System.out.print("|"  +i  );

        }
    }
}
