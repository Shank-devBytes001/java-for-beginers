import java.io.*;
import java.util.*;

class Exception
{
	public static void main(String args[])
	{
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input two integers");
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			result=a/b;
			System.out.println("Result="+result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception caught:Divide by zero error"+e);
		}
		
			System.out.println("Program ended");
		
	}
}