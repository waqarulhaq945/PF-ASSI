import java.util.Scanner;

public class Q3 
{
    public static void main(String[]args)
     {

        double csp, dsp, dp, discount;

        Scanner ki = new Scanner(System.in);

        System.out.println("Enter CSP:");
        csp = ki.nextDouble();

        System.out.println("Enter DP:");
        dp = ki.nextDouble();

        discount = dp * csp / 100;
        dsp=csp - discount;

        System.out.println("Discounted Selling Price: " + dsp);
     }
}     









































