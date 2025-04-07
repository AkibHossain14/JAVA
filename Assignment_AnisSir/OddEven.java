import java.util.Scanner ;
class OddEven { 
 public static void main ( String[] args ){ 
    System.out.print( " please enter a posetive integer number " ) ;
	int num ; 
	Scanner input = new Scanner ( System.in) ;
	
	num = input.nextInt() ;
	
	if ( num%2==0 ) {
		System.out.println ( num + " is a EVEN number " ) ;
	}
	else {
		System.out.println ( num + " is a ODD number " ) ;
	}
 
 
 
 
 }




}