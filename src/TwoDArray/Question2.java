package TwoDArray;

import java.util.Scanner;

public class Question2 {
    //Row Sum
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Column : ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<m;i++){
            int sum = 0;
            for (int j = 0;j<n;j++){
                sum+=mat[i][j];
            }
            System.out.println(sum);
        }
    }
}
