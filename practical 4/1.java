import java.util.*;
class student
{
	int rno;
	String n,br;
	
	Scanner s=new Scanner(System.in);
	void accept_detail()
	{
		System.out.println("Enter the name:");
		n=s.nextLine();
		System.out.println("Enter the roll no:");
		rno=s.nextInt();
		System.out.println("Enter the branch:");
		br=s.nextLine();
	}
}
class performance extends student
{
	int[] mark = new int[3];
	float avg;
	void get_detail()
	{
		super.accept_detail();
		for(int i=0;i<3;i++)
		{		
			System.out.println("Enter the Marks of "+ i +"Subject:");
			mark[i]=s.nextInt();
		}
	}
	void calc_avg()
	{
		int s=0;
		for(int i=0;i<3;i++)
			s+=mark[i];
		avg=(float)s/3;
	}
	void display()
	{
		System.out.println("Name:"+n+"\nRoll No.:"+rno+"\nBranch:"+rno+"\nAverage:"+avg);
	}

	public static void main(String arg[])
	{
		performance obj = new performance();
		obj.get_detail();
		obj.calc_avg();
		obj.display();
	}
}