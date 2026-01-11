import java.util.Scanner;
public class Q2
 {	
	public static void main(String[]args)
 	 {
	    double R , C, A;
	    Scanner x;
	    x = new Scanner(System.in);
	    System.out.println("Enter the Radius of Circle");
	    R = x.nextDouble();
 	    System.out.println("For Circumference");
	    C = 2 * 3.142 * R;
	    System.out.println("Circumference:" + C);
	    
	    System.out.println("For AREA");
	    A = 3.142 * Math.pow(R, 2);
	    System.out.println("Area:" + A);
	  }
  }