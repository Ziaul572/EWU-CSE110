import java.util.Scanner;

public class lab4 {
	public static void main(String[] args) {
		  
	       Scanner input = new Scanner(System.in);
	          int[] distNum = new int[10]; 
	          int num; 
	          int count = 0;

	      System.out.print("Enter ten numbers: ");
	         for (int i = 0; i < 10; i++) {
	                 num = input.nextInt();

	        if (isDist(distNum, num)) {
	            distNum[count] = num;
	               count++; 
	}
	}
	         input.close();

	       System.out.printf("There are %d Distinct number.\n " , count);
	         System.out.print("The Distinct Numbers are");
	         for (int i = 0; i < distNum.length; i++) {
	                if (distNum[i] > 0)
	          System.out.print(" " + distNum[i]);
	}
	               System.out.println();
	}

	       public static boolean isDist(int[] arr, int num) {
	               for (int i = 0; i < arr.length; i++) {
	               if (num == arr[i])
	                return false;
	}
	            return true;
	       }
}