import java.util.*;
class Account
{
	
	long acc_no;
	String customerName;
	void Acct_Details(long a)
	{
		acc_no=a;
	}
	void setname(String b)
	{
		customerName=b;
	}
	long get_customerid()
	{
		return acc_no;
	}
	String get_name()
	{ 
		return customerName;
	}
}
class Saving_Acc extends Account
{
	static float Min_bal = (float)5000.0;
	float  saving_bal;
	void set_balance(float a)
	{
		if(a < 5000)
		{
			System.out.println("insufficient balance");
			System.exit(1);
		}
		saving_bal = a;
	}
	float get_balance()
	{ 
		return saving_bal;
	}

}

class Acct_Details extends Saving_Acc
{	
	void deposits(float a)
	{
		saving_bal = saving_bal + a;
	}
	void withdraw(float a)
	{ 
		saving_bal = saving_bal- a;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);		
		Acct_Details obj = new Acct_Details();
		System.out.println("Enter Name:");
		String name=s.next();
		obj.setname(name);
		System.out.println("Enter acc_no:");
		long i=s.nextLong();
		obj.Acct_Details(i);	
		System.out.println("Enter balance:");
		float d=s.nextFloat();
		obj.set_balance(d);
		d=s.nextFloat();
		obj.deposits(d);
		d=s.nextFloat();
		obj.withdraw(d);
		System.out.println("Customer acc_no:"+obj.get_customerid()+"\nName:"+obj.get_name()+"\nBalance:"+obj.get_balance());
		
		}
}
