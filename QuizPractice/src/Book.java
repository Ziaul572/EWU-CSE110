import java.util.ArrayList;

public class Book {
	
	private static String bookTitle;
	private static double bookISBN;
	private static int authorCount = 0;
	static ArrayList <Author> authorList = new ArrayList<Author> ();
	
	Book(){
		
	}
	
	public void setBookTitle(String title) {
		bookTitle = title;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setISBN(double isbn) {
		bookISBN = isbn;
	}
	public double getISBN() {
		return bookISBN;
	}
	
	public static void addAuthor(Author obj) {
		authorList.add(obj);
		authorCount ++;
	}
	
	public int getAuthorCount() {
		return authorCount;
	}
	public static void display() {
//		System.out.println("Book Title: " + bookTitle);
//		System.out.println("book ISBN : " + isbn);
//		System.out.println("Author Name : " + authorList.get(0).getName());
//		System.out.println("Author Age : " + authorList.get(0).getAge());
//		System.out.println("Author Date of Birth : " + authorList.get(0).getDOB());
//		System.out.println("Author Surname : " + authorList.get(0).getSurname());
		for (int i = 0; i < 2; i++) {
			System.out.println("Book Title : " + bookTitle);
			System.out.println("book ISBN : " + bookISBN);
			
			for(int j = 0; j < 4; j++) {
				if(i == 2) {
					j = j + 2;
				}
				System.out.println("Author Name : " + authorList.get(j).getName());
				System.out.println("Author Age : " + authorList.get(j).getAge());
				System.out.println("Author Date of Birth : " + authorList.get(j).getDOB());
				System.out.println("Author Surname : " + authorList.get(j).getSurname());
				System.out.println();
			}
		}
		
	}
}
