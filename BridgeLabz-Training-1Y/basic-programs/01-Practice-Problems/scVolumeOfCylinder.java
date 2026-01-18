import java.util.Scanner;
class scVolumeOfCylinder {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius =");
		int r = sc.nextInt();
		System.out.println("Enter height");
		int h = sc.nextInt();
		double V = 3.14 * r * r * h;
		System.out.println("Volume Of Cylinder"+V);
		sc.close();
	}
}
		