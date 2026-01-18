import java.util.Scanner;
class scPowerCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		int B = sc.nextInt();
		System.out.println("Enter Exponent");
		int E = sc.nextInt();
		double PC = Math.pow(B,E);
		System.out.println("Power Calculation ="+PC);
		sc.close();
	}
}