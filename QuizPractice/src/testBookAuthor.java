import java.util.ArrayList;
import java.util.Scanner;

public class testBookAuthor {
	
	public static void main (String [] args) {
		
		ArrayList<Book> bookList = new ArrayList <Book> ();
		ArrayList<Author> authorList = new ArrayList<Author>();
		
		Scanner input = new Scanner (System.in);
		
		
		
		System.out.println("Now, Enter two Book info.");

//		System.out.println("Enter 2nd Book Title.");
//		book2.setBookTitle(input.next());
//		System.out.println("Enter 2nd Book ISBN.");
//		book2.setISBN(input.nextDouble());
		for(int i = 0; i < 2; i++) {
			Book book = new Book();
			System.out.println("Enter Book Title.");
			book.setBookTitle(input.next());
			System.out.println("Enter Book ISBN.");
			book.setISBN(input.nextDouble());
				
			bookList.add(book);
		}
		
		for(int i = 0; i < 4; i++) {
			Author author = new Author();
			
			System.out.println("Enter Author Name.");
			author.setName(input.next());
			System.out.println("Enter Author Age.");
			author.setAge(input.nextDouble());
			System.out.println("Enter the Date of Birth of Author. (eg. 16thDecember)");
			author.setDOB(input.next());
			System.out.println("Enter Author Surname.");
			author.setSurname(input.next());
			
			authorList.add(author);
			
			if (i < 2) {
				Book.addAuthor(author);
			}
			else {
				Book.addAuthor(author);
			}
		}
		input.close();
		
		Book.display();
		
	}
	
}
