import java.util.Scanner;

public class lab2 {
	public static void main( String[] args) {
		
		String name ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a name.\n");
		
		name  = input.next();
		
		int length = name.length() ;
		int lastIndex = length;
		input.close();
		int count = 0;
		for(int i = 0; i < (length ) ; i++) {
			if (name.charAt(i) == name.charAt(lastIndex)) {
				count++;
				lastIndex --;
			}
		}
		if (count == (length )) {
			System.out.println("The String is Palindrome\n");
		}
	
		//System.out.print(name.charAt(2));
		
	}  
}