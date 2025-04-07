import java.util.Scanner ;
class UserInput{
	public static void main( String[] args ){
	String id, title,description,category ;
	double price;
	Scanner input = new Scanner( System.in) ;
	System.out.print ("please enter the book id : " );
	id = input.nextLine();
	System.out.print ("please enter the book title : " );
	title=input.nextLine();
	System.out.print ("please enter the book description : " );
	description = input.nextLine();
	System.out.print ("please enter the book category : " );
	category= input.nextLine() ; 
	System.out.print ("please enter the book price : " );
	price=input.nextDouble() ;
	
	
	
		System.out.println( " the book id is : " + id) ;
		System.out.println( " the book title is : " + title) ;
		System.out.println( " the book description is : " + description) ;
		System.out.println( " the book category is : " + category) ;
		System.out.println( " the book price is : " + price) ;
	
	
	
	}
	
}
		