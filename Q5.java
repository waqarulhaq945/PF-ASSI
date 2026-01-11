import java.util.Scanner;

public class Q5
 {
	 public static void main(String[]args)
	  {
		double Watt, Amp, Volts;
	  	
		Scanner ki = new Scanner(System.in);
		
		System.out.println("Enter Volts");
		Volts = ki.nextDouble();
			
		System.out.println("Enter Amp");
		Amp = ki.nextDouble();

		Watt = Amp * Volts;
		System.out.println("power as per the given input is:  " + Watt);
	   }
 }