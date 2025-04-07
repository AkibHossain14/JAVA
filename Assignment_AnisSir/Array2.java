import java.util.Scanner; 
class Array2{
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in) ;
		System.out.print( " please enter a nuber between 1 to 7 :");
		int num = input.nextInt() ;
		String[] days = { "Saturday" , "Sunday" , "Monday" ,"tuesday"," Wednesday" , "Thursday" , "Friday" } ;
		for ( int i =0 ; i<days.length; i++ ) {
			if ( num == i+1 ){
				System.out.print(days[i]) ;
			}
			else {
				System.out.print (" Please enter a valid day number " );
			}
		}
		
		
	
	}
	
}