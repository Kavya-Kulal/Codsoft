import java.io.*;
import java.util.Random;
class Grade_calculator
{
	public String grade(float avg) throws Exception
	{
		
		
		if(avg>=85)
		{
			return "Distinction";
		}
		else if(avg>=60)
		{
			return "First class";
		}
		else if(avg>=50)
		{
			return "Second class";
		}
		else if(avg>=35)
		{
			return "Third class";
		}
		else
		{
			return "Fail";
		}
			
		
	}
	public static void main(String[] args) throws Exception
	
	{
		Grade_calculator g=new Grade_calculator();
		DataInputStream in=new DataInputStream(System.in);
		
		System.out.println("*******************************STUDENT DETAILS*******************************");
		System.out.println("Enter the student roll");
		String rno=in.readLine();
		
		System.out.println("Enter the student name");
		String name=in.readLine();
		
		System.out.println("Enter the marks of all six subjects");
		
		System.out.println("Kannada");
		int k=Integer.parseInt(in.readLine());
		
		System.out.println("English");
		int e=Integer.parseInt(in.readLine());
		
		System.out.println("Hindi");
		int h=Integer.parseInt(in.readLine());
		
		System.out.println("Mathematics");
		int m=Integer.parseInt(in.readLine());
		
		System.out.println("Science");
		int s=Integer.parseInt(in.readLine());
		
		System.out.println("Social science");
		int sc=Integer.parseInt(in.readLine());
		
		int tot=(sc+s+m+h+k+e);
		
		float avg=tot/6;
		
		String res=g.grade(avg);
		
		System.out.println("Roll no         -"+rno);
		System.out.println("Name            -"+name);
		System.out.println("Kannada         -"+k);
		System.out.println("English         -"+e);
		System.out.println("Hindi           -"+h);
		System.out.println("Mathematics     -"+m);
		System.out.println("Science         -"+s);
		System.out.println("Social science  -"+sc);
		System.out.println("Total marks is   -"+tot+"/600");
		System.out.println("Percentage is    -"+avg);
		
		System.out.println("Grade           -"+res);
		
		
	}
	
	
	
	
}
		
		