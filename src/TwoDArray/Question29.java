package TwoDArray;

import java.util.Scanner;

public class Question29 {
    //Column Sort
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Size of Column : ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m-1;j++){
                for (int k = 0;k<m-j-1;k++){
                    if (mat[k][i]>mat[k+1][i]){
                        int temp = mat[k][i];
                        mat[k][i] = mat[k+1][i];
                        mat[k+1][i] = temp;
                    }
                }
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
