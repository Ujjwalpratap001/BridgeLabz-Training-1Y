import java.util.Scanner;
class scKmstoMiles {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Kilometers");
		int Kms = sc.nextInt();
		double Miles = Kms * 0.621371;
		System.out.println("Miles ="+Miles);
		sc.close();
	}
}