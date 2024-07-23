import java.io.*;
import java.util.*;

class Staff
{
	String name,id;
	long ph;
	float sal;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name =sc.next();
		System.out.println("enter the id:");
		id=sc.next();
		System.out.println("enter the phone no:");
		ph=sc.nextLong();
		System.out.println("enter the salary:");
		sal=sc.nextFloat();
	}
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("phno:"+ph);
		System.out.println("salary:"+sal);
	}
}
class Teaching extends Staff
{
	String domain;
	int n;
	public void accept()
	{
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the domain:");
		domain=sc.next();
		System.out.println("enter no of publication:");
		n=sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("domain:\n"+domain);
		System.out.println("publications:\n"+n);
	}
}
class Techinical extends Staff
{
	String skills;
	public void accept()
	{
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter y r Skills:");
		skills=sc.nextLine();
		System.out.println("");
	}
	public void display()
	{
		super.display();
		System.out.println("theskills: \n"+skills);
		System.out.println("");
	}
}
class Contract extends Staff
{
	int period;
	public void accept()
	{
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("time period:"+period);
		period=sc.nextInt();
		System.out.println("");
	}
	public void dispaly()
	{
		super.display();
		System.out.println("time periodis:"+period);
		System.out.println("");
	}
}
class Four
{
	public static void main(String args[])
	{
		Teaching teaching=new Teaching();
		System.out.println("enter the details of teaching staff:");
		teaching.accept();

		Techinical techinical=new Techinical();
		System.out.println("enter the details of techinical staff:");
		techinical.accept();

		Contract contract=new Contract();
		System.out.println("enter the details of contractors");
		contract.accept();

		System.out.println("the details of teaching staff are:");
		teaching.display();

		System.out.println("the details of techinical staff are:");
		techinical.display();

		System.out.println("the details of contract staff are:");
		contract.display();
	}
}