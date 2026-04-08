package TwoDArray;

import java.util.Scanner;

public class Question11 {
    //Matrix Sums
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Column : ");
        int n = sc.nextInt();
        int[][] mat1 = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat1[i][j] = sc.nextInt();
            }
        }
        int[][] mat2 = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
