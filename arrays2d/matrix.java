package arrays2d;

import java.util.Scanner;

public class matrix {

    //searching a value in matrix
    public static void search(int[][] matrix, int key){
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (matrix[i][j]==key) {
                    System.out.println("Element found at index: " + i + " " + j);
                    return;
                }
            }
        }
    }
    public static void main(String args[]){
        int[][] matrix = new int[3][3];
        int n=matrix.length, m=matrix[0].length;

        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 8);
    }
}
