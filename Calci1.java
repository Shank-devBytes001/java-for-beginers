import java.io.*;
import java.util.*;
 
class Calci1
{
 public static void main(String[]arg)
 {
	 System.out.println("enter the operator:+,-,*,%,/");
	 Scanner sc=new Scanner(System.in);
	 char op=sc.next().charAt(0);
	 System.out.println("enter the two numbers:");
	 double a=sc.nextDouble();
	 double b=sc.nextDouble();
	 double result=0;
	 switch(op)
	 {
		 case'+':
			 result=a+b;
		 	 System.out.format("%.3f%c%.3f=%.3f",a,op,b,result);
			 break;

		case'-':
			 result=a-b;
		 	 System.out.format("%.3f%c%.3f=%.3f",a,op,b,result);
			 break;

		case'*':
			 result=a*b;
		 	 System.out.format("%.3f%c%.3f=%.3f",a,op,b,result);
			 break;

		case'%':
			 result=a%b;
		 	 System.out.format("%.3f%c%.3f=%.3f",a,op,b,result);
			 break;

		case'/':
		if(b!=0)
		 {
			result=a/b;
			System.out.format("%.3f%c%.3f=%.3f",a,op,b,result);
		 }
		 else 
			 System.out.println("error");
		 	 break;

		default:
			 System.out.println("error");
			 break;
	 }
 }
}





		 	 

	




