
public class Ques3 {
	public static void processExamData(int data [][], String name []) {
		
		int i, j, max = 0;
		int k, highIndex = 0;
		
		for( j = 0; j < data[j].length ; j++ ) {
			 k = 0;
			for(i = 0; i < data[k].length ; i++) {
				if (max <= data[i][j]) {
					max = data[i][j] ;
					highIndex = i ;
					//System.out.print("yo");
					k++;
				}
			}
			
			if(j == 0) {
				System.out.println("Quiz- Highest : " + name[highIndex]);
			}
			else if (j == 1) {
				System.out.println("Mid1- Highest : " + name[highIndex]);
			}
			else if (j == 2) {
				System.out.println("Mid2- Highest : " + name[highIndex]);
			}
			else if (j == 3) {
				System.out.println("Final- Highest : " + name[highIndex]);
			}
			else if (j == 4) {
				System.out.println("Project- Highest : " + name[highIndex]);
				break;
			}
			
		}
		
	}
	public static void main (String [] args) {
		
		
		int [][] dataSet = {{20, 15, 8, 14, 12},
				   {10, 19, 12, 5, 14},
				   {15, 14, 4, 12, 12},
				   {9, 8, 20, 6, 14},
				   {14, 20, 14, 20, 15}};
	
		
		String name [] = {"Dave", "Sakib", "Eva", "Mira", "Rayan"};
	
		processExamData(dataSet, name);
		
	}
}
