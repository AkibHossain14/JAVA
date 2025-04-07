public class FixedDeposit extends Account {
	
	private int year ;
	public void setYear( int year ) {
		if ( year>0 ) {
			this.year=year ;
		}
		else {
			System.out.println("invalid year  ");
		}
	}
	public int getYear () { return year ;} 
	
	public FixedDeposit(String accountNo , String accountHolderName, double balance , double interestRate, int year )  {
		super(accountNo, accountHolderName,balance,interestRate);
		setYear(year );
	}
	public void showDetails () {
		super.showDetails() ;
		System.out.println("fixed deposit year is  :" + year );
	}
	
}