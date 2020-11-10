
public class book {
	
	int ISBN;
	String title;
	int page ;
	int count ;
	
	book(){
		
	}
	book (int isbn, String t, int p){
		ISBN = isbn;
		title = t;
		page = p;
	}
	
	public static void displayAll(book obj) {
		System.out.println("ISBN serial: " + obj.ISBN);
		System.out.println("Book Title : " + obj.title);
		System.out.println("Total Page : " + obj.page);
		
	}
	public static boolean isHeavier(book obj) {
		if(obj.page > 500) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int compareTo(book obj, book obj1) {
		int value;
		if(obj.page > obj1.page) {
			value = 1;
			return value;
		}
		else if (obj.page < obj1.page) {
			value = 0;
			return value;
		}
		else {
			value = -10 ;
			return value;
		}
	}

}
	
