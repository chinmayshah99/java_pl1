import java.util.Scanner; //importing scanner package
class p2 //class name
{ 
  public static void main(String args[])
	{   
		int a,b,c1,c2,c3,c4;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the two numbers:");
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("enter your choice 1.add 2.sub 3. product 4. divide");
		int d= sc.nextInt();
		switch(d)
		{
			case 1:
				{
					c1=a+b;
					System.out.println("result of add:"+c1);
					break;
				}
			case 2:
				{
					c2=a-b;
					System.out.println("result of sub:"+c2);
					break;
				}
			case 3:
				{
					c3=a*b;
					System.out.println("result of product:"+c3);
					break;
				}
			case 4:
				{
					c4=a/b;
					System.out.println("result of division:"+c4);
					break;
				}
			default: 
				System.out.println("error");
		}
	}
}
