/* 
import java.util.*;
public class matrices {
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        int n = matrix.length,m = matrix [0].length;
        Scanner sc = new Scanner(System. in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
             System.out.println();
        }
    }
}*/

  // to search any key value
import java.util.*;
 /*public class matrices {
 public static boolean search(int matrix [][], int key){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j]== key){
                System.out.println(key +"found at cell("+ i +","+j+")");
                return true;
            }
        }
    }
    System.out.println("key not found");
    return false;
 }


    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        int n = matrix.length,m = matrix [0].length;
        Scanner sc = new Scanner(System. in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
               
            }
             System.out.println();
        }
          search(matrix,6);
    }
}*/


// v.Imt Qn. spiral matrix


   /*  public class matrices{
    public static void printSpiral(int matrix [][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
    while(startRow<=endRow && startCol<=endCol){
        //top
        for(int j=startCol; j<=endCol; j++){
             System.out.print(matrix[startRow][j]+" ");
        }
        //right
        for( int i= startRow+1; i<=endRow; i++){
            System.out.print(matrix[i][endCol]+" ");
        }
    //bottom
    for(int j=endCol-1; j>=startCol; j--){
        if(startCol == endCol){
             break;
        }
        System.out.print(matrix[endRow][j]+" ");
    }
    //left for(int i=endRow-1; i>=startRow+1; i--){
        if(startCol == endCol){
             break;
        }
        System.out.print(matrix[i][startCol]+" ");
     }
     startCol++;
     startRow++;
     endCol--;
     endRow--;
    }
    System.out.println();
    }
 public static void main (String args[]){
  int matrix[][] = {{5, 4 ,2, 1},{3, 7 ,6, 9},{8, 11, 10, 14},{13, 12, 15, 16}};
  printSpiral(matrix);
 }


}*/



 /*public class matrices {
    public static void printSpiralAndFindLargest(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        // Largest element ko track karne ke liye variable (Integer ki minimum value se start kiya)
        int largest = Integer.MIN_VALUE;

        System.out.print("Spiral Order: ");

        while (startRow <= endRow && startCol <= endCol) {
            // 1. Top Boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
                if (matrix[startRow][j] > largest) {
                    largest = matrix[startRow][j];
                }
            }

            // 2. Right Boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
                if (matrix[i][endCol] > largest) {
                    largest = matrix[i][endCol];
                }
            }

            // 3. Bottom Boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                // AGAR SINGLE ROW BACHI HAI TO DOUBLE PRINTING SE BACHNE KE LIYE
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
                if (matrix[endRow][j] > largest) {
                    largest = matrix[endRow][j];
                }
            }

            // 4. Left Boundary
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // AGAR SINGLE COLUMN BACHA HAI TO DOUBLE PRINTING SE BACHNE KE LIYE
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
                if (matrix[i][startCol] > largest) {
                    largest = matrix[i][startCol];
                }
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
        // Largest number ko print karne ke liye
        System.out.println("Largest Element: " + largest); 
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {5, 4, 2, 1},
            {3, 7, 6, 9},
            {8, 11, 10, 14},
            {13, 12, 15, 16}
        };
        
        printSpiralAndFindLargest(matrix);
    }
}*/

/*public class matrices {  
  /*public static int digonalSum(int matrix[] []){
    int sum  = 0;
    for(int i = 0; i<matrix.length; i++){
        for(int j= 0; j<matrix[0].length; j++){
            if(i==j){
                sum += matrix[i] [j];
            }
            else if( i+j == matrix.length-1){
                sum += matrix[i][j];
            }
        }
    }
    return sum;
   }

  public static int digonalSum(int matrix[][]){
    int sum = 0;
    for(int i=0; i<matrix.length; i++){
         //pd
      sum+= matrix[i][i];
         //sd 
         if(i!= matrix.length -1-i){
            sum+= matrix[i][matrix.length-i-1];
            
        }
      }
    return sum ;
      }
    


    public static void main( String args[]){
        int matrix[][] = {{1, 2, 3, 4,}, {5, 6, 7, 8},{9, 10, 11, 12,},{13, 14, 15, 16}};
        System.out.print( digonalSum (matrix));
    }
}*/

// search in sorted matrix 

public class matrices{
  public static boolean staircaseSearch(int matrix[][] , int key){
    int row = 0,col = matrix[0].length-1;
    while(row<matrix.length && col>=0){
        if(matrix[row][col]==key){
            System.out.print("found key at ("+row+","+col+")");
            return true;
        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
    }
    System.out.println("key not found !");
     return false;
  }


    public static void main (String args[]){
        int matrix[][] = {{10, 20, 30, 40},{15, 25, 35, 45 },{27, 29, 37, 48 },{32, 33, 39, 50 }};
        int key = 37;
        staircaseSearch(matrix,33);
    } 
} 



