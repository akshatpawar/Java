package arrays2d;

public class spiralmatrix {
    public static void spiralMatrix(int[][] matrix){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top row
            for(int i=startCol; i<=endCol; i++){
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;
            //right column
            for(int i=startRow; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;
            //bottom row
            if(startRow<=endRow){
                for(int i=endCol; i>=startCol; i--){
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }
            //left column
            if(startCol<=endCol){
                for(int i=endRow; i>=startRow; i--){
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        spiralMatrix(matrix);
    }
}
