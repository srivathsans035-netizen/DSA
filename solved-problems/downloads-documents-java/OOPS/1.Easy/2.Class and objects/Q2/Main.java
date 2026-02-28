class Main{
	
	public static void main(String [] args){
		
		BankAccount c1 = new BankAccount(10001,0,"Savings account");
		BankAccount c2 = new BankAccount(10002,0,"Savings account");
		
		c1.setBalance(23450.98);
		c2.setAccType("Fixed deposit account");
		
		System.out.print(c1 + "\n" + c2);
		
	}
}