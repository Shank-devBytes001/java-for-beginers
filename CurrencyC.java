package cc;
import java.util.*;
public class CurrencyC
{
 	double inr,usd;
 	Scanner in=new Scanner(System.in);
  	public void dollartorupee()
  	{
    		System.out.println("enter the dollar to convert into rupee:");
    		usd=in.nextDouble();
    		inr=usd*81.83;
    		System.out.println("dollar ="+usd+" equal to INR="+inr);
    		System.out.println("\n");
  	}
	public void rupeetodollar()
	{
  		System.out.println("enter the rupees to convert into dollar:");
   		inr=in.nextDouble();
   		usd=inr/81.83;
 		System.out.println("Rupee="+inr+" equal to dollar="+usd);
 		System.out.println("\n");
 	}
}     
 