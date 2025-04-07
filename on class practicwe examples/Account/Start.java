public class Start{
	public static void main ( String[] args ) {
	Account a1= new Account ( "11111", "Akib Hossain", 45000, 5.6) ;
	a1.showDetails() ;
	
	Savings s1 = new Savings ("22222" , " aihhk" , 40000, 4.6 ) ;
	s1.showDetails() ;
	s1.deposit(10000);
	s1.showDetails() ;
	s1.deposit(100);
	s1.withdraw(45000);
	s1.showDetails() ;
	s1.withdraw(10000);
	s1.showDetails() ;
	
	OverDraft od1 = new OverDraft ( "33333", "gygutyjk", 45000,3.5,20000) ;
	
	od1.showDetails() ;
	od1.withdraw(60000);
	od1.showDetails() ;
	od1.withdraw(10000) ;
	od1.showDetails() ;
	
	
	FixedDeposit fd1 = new FixedDeposit ( "44444", "tdyhgd", 500000, 5.5, 12   );
	fd1.showDetails();
	
	
	
	}
	
}