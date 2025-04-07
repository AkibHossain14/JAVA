import java.util.Scanner ;
public class UserInput{
	
	public static void main ( String[] args ) {
		
		String id ;
		String title ;
		String price ;
		String description ;
		String category ;
		
		Scanner input = new Scanner (System.in) ;
		System.out.print ( " Please enter the product id : " ) ;
		id = input.nextLine () ;
		System.out.print ( " Please enter the product title  : " ) ;
        title = input.nextLine () ;
		System.out.print ( " Please enter the product price  : " ) ;
		price=input.nextLine();

       	System.out.print ( " Please enter the product description : " ) ;
		description= input.nextLine() ;
		System.out.print ( " Please enter the product category : " ) ;
		category= input.nextLine() ; 
		
		
			System.out.println ( " product id is :" + id ) ;
			System.out.println ( " product title  is :" + title ) ;
			System.out.println ( " product price  is :" + price  ) ;
			System.out.println ( " product description  is :" + description  ) ;
			System.out.println ( " product category  is :" + category  ) ;
		

		
		
		
		
		
	}
	
	
	
	
	
}