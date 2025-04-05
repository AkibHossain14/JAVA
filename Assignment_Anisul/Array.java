import java.util.Scanner ;

class Array { 
 public static void main ( String [] args ) {
	 Scanner input = new Scanner(System.in) ;
	 
	 int [] number = new int [5] ;
	 
	 System.out.println ( "Please enetr 5 integer numbers  " ) ;
	 for ( int i = 0 ; i<number.length ; i++ ) {
		 System.out.print( "Number " +(i+1) + " is :") ; 
		 number[i] = input.nextInt() ; 
	 }
	 int sum=0 ; 
	 System.out.println ( ) ;
	 for ( int i = 0 ; i<number.length ; i++ ) {
		 sum = sum + number[i]; 
	 
	 }
	 System.out.println (" total sum is :" + sum  ) ;
 }

}