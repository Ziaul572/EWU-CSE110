import java.util.Scanner;

public class testBook {
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter number of books : ");
		int n = input.nextInt();
		
		book bookNum [] = new book [n] ;
		int isbn, page;
		String title;
		
		for(int i = 0; i < bookNum.length; i++) {
			System.out.println("Enter the ISBN serial of the book : ");
			isbn = input.nextInt();
			System.out.println("Enter the Book Title : ");
			title = input.next();
			System.out.println("Enter the amount of pages in the book : ");
			page = input.nextInt();
			
			bookNum[i] = new book(isbn, title, page);
		}
		input.close();
		for( int i = 0; i < bookNum.length ; i++) {
			book.displayAll(bookNum[i]);
		}
		System.out.println();
		boolean heavy;
		for(int i = 0; i < bookNum.length; i++) {
			heavy = book.isHeavier(bookNum[i]);
			if (heavy == true) {
				System.out.printf("Book %d is a Heavy Book.\n", i );
			}
		}
		System.out.println();
		int returnValue;
		for(int i = 0; i < bookNum.length - 1; i++ ) {
			returnValue = book.compareTo(bookNum[i], bookNum[i + 1]);
			System.out.printf("Comparing Book %d and Book %d the returned Value is %d. \n", i, i + 1, returnValue);
			
		}
		System.out.println("Total number of Books : " + book.count);
	}
}
