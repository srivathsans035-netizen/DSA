class BankAccount{
	
	private int accountNumber;
	private double balance;
	private String accountType;
	
	public BankAccount(int accountNumber, double balance, String accountType){	
		this.accountNumber = accountNumber;		
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public void setAccNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setAccType(String accountType){
		this.accountType = accountType;
	}
	
	public int getAccNumber(){
		return accountNumber;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getAccType(){
		return accountType;
	}
	
	@Override
	public String toString(){
		return "Account number : " + accountNumber + ", Balance : " + balance + ", Account Type : " + accountType;
	}
}