class package tc;
import java.util.*;
public class TimeC
{
 	int hours,minutes;
 	Scanner in=new Scanner(System.in);
	public void hourstominutes()
	{
 		System.out.println("enter the hours to convert into minutes");
 		hours=in.nextInt();
 		minutes=(hours*60);
 		System.out.println("minutes:"+minutes);
 	}
	public void minutestohours()
	{
 		System.out.println("enter the minutes to convert into hours");
 		minutes=in.nextInt();
 		hours=(minutes/60);
 		System.out.println("hours:"+hours);
 	}
}
 
 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
