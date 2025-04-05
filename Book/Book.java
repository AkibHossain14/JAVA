public class Book {
	private String bookName ;
	private String bookAuthor ;
	private  String bookId ;
	private String bookType;
	private int bookCopy ;
	
	static int uniqueBookCouner = 0;
	
	
	public Book ( ) {
	
	System.out.println ( "default parameter called " ) ;
	
	
	uniqueBookCouner++;
	}
	
	
	
	

	
	public Book( String bookName , String bookAuthor , String bookId, String bookType , int bookCopy ) {
	setBookname (bookName ) ;
	setBookAuthor ( bookAuthor) ;
	setBookID (bookId);
	setBookType( bookType) ;
	setBookCopy(bookCopy);
	uniqueBookCouner++;
	}
	
	public void setBookname(String bookName){
		this.bookName=bookName;
	}
	
	public String getBookName (){
		return bookName ;
	} 
	
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor=bookAuthor;
	}
	
	public String getBookAuthorName (){
		return bookAuthor ;
	}
	
	public void setBookID(String bookId){
		this.bookId=bookId;
	}
	
	public String getBookId (){
		return bookId ;
	}
	
	public void setBookType(String bookType){
		this.bookType=bookType;
	}
	
	public String getBookType (){
		return bookType ;
	}
	public void setBookCopy(int bookCopy){
		this.bookCopy=bookCopy;
	}
	
	public int getBookCopy (){
		return bookCopy ;
	}
	
	public void showDetails () {
		System.out.println( "__________________" );
		System.out.println( "Book Name : " + bookName);
		System.out.println ("Book Auhor : " + bookAuthor);
	    System.out.println ( " Book Id :" + bookId);
		System.out.println ( "Book TYyype: " + bookType);
		System.out.println( " Total Bok Copy :" + bookCopy);
		System.out.println( "__________________" );
	}
	
	public void addBookCopy (int x) {
	this.bookCopy = bookCopy + x;
	System.out.println ( x + " Copies added . toal copy now " + this.bookCopy);
	}
	
	public static void totalNumberOfUniqueBooks(){
		
		System.out.println(" total number of unique books : " + uniqueBookCouner);
	}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		 
		
