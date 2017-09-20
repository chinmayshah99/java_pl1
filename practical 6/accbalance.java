package mypack;
class accbalance {
	public static void main(String[] args) {
		balance obj = new balance(100,"cs");
		obj.deposit(1200);
		obj.withdraw(20);
		int k = obj.checkbalance1();
		System.out.println(k);
	}
}