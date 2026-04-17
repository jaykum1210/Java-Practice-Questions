package TwoDArray;

import java.util.Scanner;

public class Question24 {
    //Upper Triangle Sum
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Row : ");
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.print("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0;i<m;i++){
            for (int j = i;j<m;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println("Sum of Upper Triangle : " + sum);
    }
}
