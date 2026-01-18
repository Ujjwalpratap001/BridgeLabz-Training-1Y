import java.util.Scanner;
class scAverageOf3Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		System.out.print("Enter second Number");
		int b = sc.nextInt();
		System.out.println("Enter third Number");
		int c = sc.nextInt();
		double Avg = (a + b + c)/3.0;
		System.out.println("Average Of 3 Numbers"+Avg);
		sc.close();
	}
}