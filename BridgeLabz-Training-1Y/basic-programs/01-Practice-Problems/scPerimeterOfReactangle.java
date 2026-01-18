import java.util.Scanner;
class scPerimeterOfReactangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int L = sc.nextInt();
		System.out.println("Enter Width");
		int W = sc.nextInt();
		double P = 2 * (L+W);
		System.out.println("Perimeter Of Reactangle"+P);
		sc.close();
	}
}