import java.util.Scanner;
class scAreaOfCircle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int R = sc.nextInt();
		double A = 3.14 * R * R;
		System.out.println("Area of Circle ="+A);
		sc.close();
	}
}