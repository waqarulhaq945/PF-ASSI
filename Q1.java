import java.util.Scanner;

public class Q1
{
	public static void main(String[]args)
	 {		

		int OM, MM;
		double P;
		Scanner x;
		x = new Scanner(System.in);
		System.out.println("Enter Obtained Marks");
		OM = x.nextInt();

		MM = 1100;

		P= 1.0 * OM / MM * 100;

		System.out.println("Percantage: " + P);
	
	    }
}	
	 