import java.util.Scanner;

public class Q8
 {
	public static void main(String[]args)
	 {	
		double a, b, c, s, k;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the Length of A");
		a = x.nextDouble();

		System.out.println("Enter the Length of B");
		b = x.nextDouble();
	
		System.out.println("Enter the Length of C");
		c = x.nextDouble();

		s = (a + b + c) / 2;

		k = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
		System.out.println("The Area of Triangle is:" + k);
	 }
 }
