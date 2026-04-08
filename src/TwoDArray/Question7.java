package TwoDArray;

import java.util.Scanner;

public class Question7 {
    //Count Even
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
        int count = 0;
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (mat[i][j]%2==0){
                    count++;
                }
            }
        }
        System.out.println("Even Numbers : " + count);
    }
}
