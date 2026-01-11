import java.util.Scanner;

public class Q4 
{
    public static void main(String[]args)
     {

        double csp, dsp, dp;

        Scanner ki = new Scanner(System.in);

        System.out.println("Enter DSP:");
        dsp = ki.nextDouble();

        System.out.println("Enter DP:");
        dp = ki.nextDouble();

        csp= (dsp * 100)/(100 - dp);
        
        System.out.println("Current Selling Price: " + csp);
     }
}     





