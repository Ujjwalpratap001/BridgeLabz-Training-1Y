import java.util.Scanner;
class scTemperature {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius");
		int C = sc.nextInt();
		int F = (C * 9/5) + 32;
		System.out.println("Fahrenheit ="+F);
		sc.close();
	}
}