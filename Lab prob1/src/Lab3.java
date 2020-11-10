import java.util.Scanner;

public class Lab3 {
	public static void main( String[] args) {
		
		String name ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a name.(use Same Letter case.)\n");
		
		name  = input.next();
		
		int length = name.length() ;
		int lastIndex = length;
		input.close();
		int count = 0;
		for(int i = 0; i < (length / 2 ) ; i++) {
			if (name.charAt(i) == name.charAt(lastIndex - 1)) {
				count++;
				lastIndex --;
			}
		}
		if (count == (length / 2 )) {
			System.out.println("The String is Palindrome\n");		
	}
		else {
		System.out.println("The String is not a Palindrome");
		}
	}  
	}
