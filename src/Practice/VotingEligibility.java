package Practice;
import java.util.Scanner;
public class VotingEligibility {
    public static void main (String...args){
        Scanner sc = new Scanner(System.in);
        //here i am defining array length
        int[] age = new int[10];


        // now i will take user input using loop
        for(int i =0;i<=age.length-1;i++) {
            System.out.print("enter age of students " +(i+1) +"--> ");
            age[i]=sc.nextInt();
        }
        // ab loop se pata karege ki age kitni hai
        for(int i=0; i<age.length; i++) {
            if(age[i]<0) {
                System.out.print("invalid age entered" +age [i]);

            }
            else if(age[i]>=18) {
                System.out.println("the student with the age" +age [i] +"can able to vote");
            }
            else {
                System.out.println("the student with age" +age [i] +"is not elligible to vote" );
            }
        }
        sc.close();
    }
}

