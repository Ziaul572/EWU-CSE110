import java.util.Arrays;

public class Lab5 {
	public static void sortbyColumn(int arr[][], int col) 
    { 
        
        Arrays.sort(arr, (final int[] entry1, final int[] entry2) -> {
            
            if (entry1[col] > entry2[col])
                return 1; 
            else
                return -1; 
        });  
    } 
      
    public static void main(String[] args) {
        
    int matrix[][] = { { 39, 27, 11, 42 }, 
                           { 10, 93, 91, 90 }, 
                           { 54, 78, 56, 89 }, 
                           { 24, 64, 20, 65 } }; 
 
    
    for(int i = 0; i < matrix.length; i++) {
    	for(int j = 0; j < matrix.length; j++) {
    		System.out.printf("%d ", matrix[i][j]);
    	}
    		System.out.println();
    }
    	System.out.println();
    
        int col = 3;
        System.out.printf("Sorting it by values in coloum %d\n", col);
        sortbyColumn(matrix, col - 1); 
  
        
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println(); 
        }
}
}
