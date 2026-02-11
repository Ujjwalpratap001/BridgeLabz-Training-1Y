import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // date input le rahe hai year-month-date
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        // 7 days 1 month 2 years add karna
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // 3 weeks subtract
        newDate = newDate.minusWeeks(3);

        // Final
        System.out.println("Final Date: " + newDate);
    }
}

