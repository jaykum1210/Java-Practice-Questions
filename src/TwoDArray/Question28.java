package TwoDArray;

import java.util.Scanner;

public class Question28 {
    //Row Sort
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
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n-1;j++){
                for (int k = 0;k<n-j-1;k++){
                    if (mat[i][k]>mat[i][k+1]){
                        int temp = mat[i][k];
                        mat[i][k] = mat[i][k+1];
                        mat[i][k+1] = temp;
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
