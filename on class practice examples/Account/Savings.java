public class Savings extends Account {
	
	
	public Savings () {} 
	public Savings ( String accountNo , String accountHolderName, double balance , double interestRate){
		super (accountNo,accountHolderName,balance,interestRate);
	}
	public void deposit ( double amount ){
		if ( amount > 0 ){
			balance = balance+amount ;
		}
		else {
			System.out.println ("innvalid deposit amount ") ;
		}
	}
	public void withdraw ( double amount ) {
		if (amount >0 && amount <= getBalance() ){
        balance= balance- amount ;
		}
        else {
			System.out.println ("innvalid withdrawal  amount ") ;
		}
	}
			
	
	
	
}