import java.util.*;
import java.io.*;

interface Resume
{
	void biodata();
}
class Teacher implements Resume
{
	String name,graduation,achievement;
	float experience;
	public void biodata()
	{
		name="Ganesha";
        graduation="m.tech";
 		achievement="gold medal";
		experience=9.8f;
		System.out.println("TEACHER RESUME");
		System.out.println("name="+name);
		System.out.println("qualifiction="+graduation);
		System.out.println("achievement"+achievement);
		System.out.println("experience="+experience);
	}
}

class Student implements Resume
{
 String name,discipline;
float result;
public void biodata()
{
 name="Gagan";
 result=9.8f;
 discipline="cse";
 System.out.println("STUDENT RESUME");
	System.out.println("name="+name);
	System.out.println("discipline="+discipline);
	System.out.println("result="+result);

 }
}
public class InterfaceP
{
	public static void main(String[]args)
	{
	Teacher obj1=new Teacher();
	obj1.biodata();
	Student obj2=new Student();
	obj2.biodata();
    }
}