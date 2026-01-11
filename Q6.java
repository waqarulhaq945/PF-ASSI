import java.util.Scanner;

public class Q6
 {
	public static void main(String[]args)
	 {	
		double a, b, h, k;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the Length of A");
		a = x.nextDouble();

		System.out.println("Enter the Length of B");
		b = x.nextDouble();

		System.out.println("Enter the Height");
		h = x.nextDouble();


		k = h * (a + b) / 2;
		System.out.println("The AREA of Trapezoid is:" + k);
	 }
 }
