import java.util.*;
class customer
{
	
	long customerId;
	String customerName;
	void setcustomerid(long a)
	{
		customerId=a;
	}
	void setname(String b)
	{
		customerName=b;
	}
	long get_customerid()
	{ 
		return customerId;
	}
	String get_name()
	{ 
		return customerName;
	}
}
class regularcustomer extends customer
{
	float discount;
	void get_discount(float a)
	{
		discount=a;
	}
	float get_discount()
	{ 
		return discount;
	}

}

class priviledgedcustomer extends customer
{
	//Scanner s=new Scanner(System.in);
	String mem_card_type;
	void setmem(String a)
	{
		mem_card_type = a;
	}
	String getmem()
	{ 
		return mem_card_type;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String m;
		System.out.println("1:Regular Customer\n2:Priviledged Customer");
		int choice=s.nextInt();
		if(choice == 1)
		{	
			regularcustomer obj=new regularcustomer();
			System.out.println("Enter Name:");
			String name=s.next();
			obj.setname(name);
			System.out.println("Enter customerId:");
			long i=s.nextLong();
			obj.setcid(i);	
			System.out.println("Enter Discount:");
			float d=s.nextFloat();
			obj.get_discount(d);
			System.out.println("Customer customerId:"+obj.get_customerid()+"\nName:"+obj.get_name()+"\nDiscount:"+obj.get_discount());
		}

		if(choice == 2)
		{
			priviledgedcustomer obj=new priviledgedcustomer();
			System.out.println("Enter Name:");
			String name=s.next();
			obj.setname(name);
			System.out.println("Enter Memory Card Type:");
			m=s.next();
			obj.setmem(m);		
			System.out.println("Enter customerId:");
			long i=s.nextLong();
			obj.setcid(i);		
			System.out.println("Customer customerId:"+obj.get_customerid()+"\nName:"+obj.get_name()+"\nMemory Card Type:"+obj.getmem());
		}

	}

}
