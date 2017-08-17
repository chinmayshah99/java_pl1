import java.util.*;
class p3 
{ 
  public static void main(String args[])
	{  
		String name;
		int sum=0,i;
		float avg;
		int student[]= new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		name=sc.next();
		for (i=0; i<7; i++)
		{
			System.out.println("enter the marks:");
			student[i]= sc.nextInt();
			sum=sum+student[i];	   
		}
		avg = sum/7;
		System.out.println("average marks="+avg);
		System.out.println(name);
		if( avg >= 50)
		   System.out.println("pass");
		else 
			System.out.println("fail");
	}
}
