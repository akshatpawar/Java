package arrays2d;

public class diagonalsum {
    public static void diagonalSum(int[][] matrix){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            sum+=matrix[i][i];  //pd
            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];  //sd
        }
        
        System.err.println(sum);
    }

    public static boolean staircaseSearch(int[][] matrix, int key){
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col]==key){
                System.err.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int key = 9;
        diagonalSum(matrix);
        staircaseSearch(matrix, key);
    }
}
