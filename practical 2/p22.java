import java.util.Scanner;

class customer{
	int id;
	String name, add;
	long telno;

	void getid(int id1)
	{
		id = id1;
	}
	int setid()
	{
		return id;
	}
	void getaddress(String address)
	{
		add = address;
	}	
	String setaddress()
	{
		return add;
	}
	void getname(String _name)
	{
		name= _name;
	} 
	String setname()
	{
		return name;
	}
	void gettelno(long _telno)
	{
		telno = _telno;
	}
	long settelno()
	{
		return telno;
	}

	public static void main(String[] args) {
		customer ob1 = new customer();
		int id;
		String name, add;
		long telno;
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter id, name, address, telephone no");
		id = sc.nextInt();
		sc.nextLine();
		//System.out.println("pls enter id, name, address, telephone no");
		name = sc.nextLine();
		//System.out.println("pls enter id, name, address, telephone no");
		add = sc.nextLine();
		//System.out.println("pls enter id, name, address, telephone no");
		telno = sc.nextLong();
		ob1.getid(id);
		ob1.getname(name);
		ob1.getaddress(add);
		ob1.gettelno(telno);

		System.out.println("Details  are"+ ob1.setid() + " " +ob1.setname()+ " " + ob1.setaddress() + " " + ob1.settelno());

	}

}