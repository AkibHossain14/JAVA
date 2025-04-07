public class Account{
	private String accountNo;
	private String accountHolderName;
	protected double balance ;
	private double interestRate ;
	 public Account () {	 }
	 public  Account ( String accountNo , String accountHolderName, double balance , double interestRate) {
		setAccountNo(accountNo) ;
		setAccountHolderName(accountHolderName);
		setBalance(balance);
		setInterestRate(interestRate) ;
	 }
	 
	public void setAccountNo ( String accountNo){
        if ( accountNo.length() > 4 ){
        this.accountNo=accountNo;}
    else {
    System.out.println("Invalid Account Number") ;}
    }
    public String getAccountNo () { return accountNo;}

   public void setAccountHolderName( String accountHolderName ) {
    if ( accountHolderName.length() >2 ) {
    this.accountHolderName=accountHolderName ;
	} 
    else {
    System.out.println ("invalid account holder name ") ;}
   }
   public String getAccountHolderName () { return accountHolderName ;}
   
    public void setBalance ( double balance ) {
    if ( balance>0 ) {
    this.balance = balance ;}
    else {
	System.out.println ("invalid balance ") ;}
	}
    public double getBalance() { return balance ;}
    
    public void setInterestRate ( double interestRate ) {
    if ( interestRate>0 ) {
    this.interestRate= interestRate ;}
    else {
    System.out.println ("invalid interest rate  ") ;}	
    }

    public double getInterestRate () { return interestRate	;}

	public void showDetails () {
		System.out.println ("______________________ ") ;
		System.out.println("Account number is :" + getAccountNo());
		System.out.println("Acccount holder name is :" +getAccountHolderName());
		System.out.println("Account Balance is :" + getBalance());
		System.out.println(" Intwerest rate is :" + getInterestRate());
		System.out.println ("______________________ ") ;

	}
	
	
	
}