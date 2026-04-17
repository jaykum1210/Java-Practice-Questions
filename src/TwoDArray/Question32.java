package TwoDArray;

import java.util.Scanner;

public class Question32 {
    // Set Matrix 0
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Column : ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat[i][j] = sc.nextInt();
                temp[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (temp[i][j] == 0){
                    for (int k = 0; k < n; k++){
                        mat[i][k] = 0;
                    }
                    for (int k = 0; k < m; k++){
                        mat[k][j] = 0;
                    }
                }
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}