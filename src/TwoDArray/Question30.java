package TwoDArray;

import java.util.Scanner;

public class Question30 {
    //Saddle point
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
        int min;
        int max;
        for (int i = 0;i<m;i++){
            boolean flag = true;
            min = Integer.MAX_VALUE;
            int minindex = 0;
            max = Integer.MAX_VALUE;
            for (int j = 0;j<n;j++){
                if (mat[i][j]<min){
                    min = mat[i][j];
                    minindex = j;
                }
            }
            for (int j = 0;j<m;j++){
                if (min<mat[j][minindex]){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(mat[i][minindex]);
                System.out.println("Row : " + (i+1) + " Column : " + (minindex+1));
                return;
            }
        }
    }
}
