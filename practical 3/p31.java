/* 
	This programs demonstrates initializing the data members 
	using default constructor and parameterized constructor.

	Chinmay Shah
*/
import java.util.Scanner;



class customer{
	int customer_id;
	long telno;
	String customer_name;

	customer()
	{
		customer_id = 0;
		telno = 0;
		customer_name ="";
	}
	customer(int id, long no, String name)
	{
		customer_id = id;
		telno = no;
		customer_name = name;
	}

	void setCustomerId(int id)
	{
		customer_id = id;
	}
	int getCustomerId()
	{
		return customer_id;
	}
	
	void setTelephone(long no)
	{
		telno = no;
	}
	long getTelephone()
	{
		return telno;
	}
	void setCustomerName(String name)
	{
		customer_name = name;
	}
	String getCustomerName()
	{
		return customer_name;
	}
	boolean validateCustomerName()
	{
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.next();
		if (((name == null) && (customer_name == null)))
			return false;
		else if (((name != null) && name.equals(customer_name)))
			return true;
		else
			return false;
		//return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id;
		long no;
		String name;

		customer c1 = new customer(10,9999999,"java boo");
		id = c1.getCustomerId();
		no = c1.getTelephone();
		name = c1.getCustomerName();
		System.out.println( id +" " + no + " " + name);
		System.out.println( "enter id, no+ name");
		id = sc.nextInt();
		no = sc.nextLong();
		name = sc.next();
		customer c2= new customer(id,no,name);
		id = c2.getCustomerId();
		no = c2.getTelephone();
		name = c2.getCustomerName();
		System.out.println(id +" " + no + " " + name);
	}
}