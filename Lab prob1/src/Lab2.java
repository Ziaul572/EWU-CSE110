
public class Lab2 {
	public static void main(String[] args) {
		
		int [][] matrix = new int [4][4] ;
		int a;
		int max = 1; 
        int min = 0; 
        int range = max - min + 1; 
        int rowCount = 0, highRow = 0;
		int colCount = 0, highCol = 0;
		int colIndex = 0;
		int rowIndex = 0;
  
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				 a = (int) (Math.random() * range) + min ;
	
				 matrix[i][j] = a;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if (matrix[i][j] == 1) {
					rowCount++;
				}
			}
			if (rowCount > highRow) {
				highRow = rowCount;
				rowIndex = i;
			}
		}
		for(int j = 0; j < 4; j++) {
			for(int i = 0; j < 4; j++) {
				if (matrix[j][i] == 1) {
					colCount++;
				}
			}
			if (colCount > highCol) {
				highCol =colCount;
				colIndex = j;
			}
		}
		System.out.printf("The largest Row Index: %d\n", rowIndex - 1);
		System.out.printf("The largest Coloum Index: %d\n", colIndex - 1);
	}
	
	
}
