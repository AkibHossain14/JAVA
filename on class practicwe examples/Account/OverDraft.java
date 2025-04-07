public class OverDraft extends Savings {
	private double limit ; 
	
	public void setLimit (double amount  ){
		
		if ( amount > 0 ) {
			limit-= amount ;
		}
		else {
			System.out.println ( " invalid limit" ) ;
		}
	}
	
	public double getLimit () { return limit ;} 
	
	public OverDraft () {} 
	public OverDraft (String accountNo , String accountHolderName, double balance , double interestRate ,double limit){
	super ( accountNo,accountHolderName, balance , interestRate );
     this.limit = limit ; 
	}
    
    public void showDetails () {
    super.showDetails ();
    System.out.println("Over Draft limit:" + limit) ;
	}
   
    public void withdraw (double amount ) {
     if ( amount > 0 && amount<= balance+limit ) {
        balance-=amount ;
	 }
     else {
        System.out.println ( " invalid overdraft withdraweal amouont " ) ;
	 }
	}	 
	
	
	
	
	
}