import java.util.Scanner;
class scAddtwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter ssecond number:");
		int b = sc.nextInt();
		int sum = a + b;
	System.out.println("Sum =" +sum);
	sc.close();
	}
}