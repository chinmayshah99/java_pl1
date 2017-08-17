import java.util.*;

class p21{

public static void  main (String args[])
{
	Scanner sc = new Scanner(System.in);
	int pid = sc.nextInt();
	int qty = sc.nextInt();
	float cost;
	if (pid != 5001 && pid != 5002 && pid != 5003 && pid != 5004 && pid != 5005 && qty <0 &&  qty >5)
	{
		System.out.println("Invalid data");
		System.exit(0);
	}
	if(pid == 5001)
	{
		System.out.println("you get 10% off");
		cost = (float)1000.0;
		cost-= 0.1*cost;
	}
	else if(pid == 5002)
	{
		System.out.println("you get 20% off");
		cost = (float)700.0;
		cost-= 0.2*cost;
	}
	else if(pid == 5003)
	{
		System.out.println("you get 30% off");
		cost = (float)1500.0;
		cost-= 0.3*cost;
	}
	else 
	{
		System.out.println("YOU GET no discount");
		cost = (float)2000.0;
	}
	float total = cost * qty;

	System.out.println("1 " + "1001 " + total +" " + qty);
}

}