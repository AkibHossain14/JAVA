public class Account{
	private String accountNo;
	private String accountHolderName;
	private double balance ;
	private double interestRate ;
	 public Account () {}
	 public  Account ( String accountNo , String accountHolderName, double balance , double interestRate) {
		 this.accountNo = accountNo;
		 this.accountHolderName  = accountHolderName;
		 this.balance=balance;
		 this.interestRate=interestRate ;
		 
	 }
	public void showDetails () {
		System.out.println("Account number is :" + accountNo);
		System.out.println("Acccount holder name is :" +accountHolderName);
		System.out.println("Account Balance is :" + balance);
		System.out.println(" Intwerest rate is :" + interestRate);
	}
	
	
	
}