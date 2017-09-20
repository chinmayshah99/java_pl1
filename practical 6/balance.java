package mypack;
class balance {
	String name;
	int balance1;

	void withdraw(int z)
	{
		balance1-=z;
	}

	void deposit(int z)
	{
		balance1+=z;
	}

	int checkbalance1()
	{
		return balance1;
	}

	balance(int bala_nce, String name)
	{
		this.balance1 =bala_nce;
		this.name = name;
	}

}