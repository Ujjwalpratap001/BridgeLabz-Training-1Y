//Write a program to take user input for 5 numbers and check whether a number is positive,
//negative, or zero. Further for positive numbers check if the number is even or odd. Finally
//compare the first and last elements of the array and display if they equal, greater or less
//Hint =>
//a. Define an integer array of 5 elements and get user input to store in the array.
//b. Loop through the array using the length If the number is positive, check for even or odd
//numbers and print accordingly
//c. If the number is negative, print negative. Else if the number is zero, print zero.
//d. Finally compare the first and last element of the array and display if they equal, greater
//or less

package Practice;
import java.util.Scanner;
public class ChexkPositiveOrNegative {
    public static void main (String... args) {
        Scanner sc = new Scanner(System.in);

        // yaha par me array bana raha hu 5 value ka
        int[] numbers = new int [5];

        // ab  me user se 5 value input le raha hu
        for(int i=0; i<numbers.length; i++) {
            System.out.print("Number " +(i+1) + "--> ");
            numbers[i]= sc.nextInt();
        }
        System.out.println(" ");
        System.out.println(" ");
       //System.out.println(" ");
        for(int i=0;i<numbers.length;i++) {
            System.out.print("Your Numbers Are : "+numbers[i]+",");
        }

    }
}
