package TwoDArray;

import java.util.Scanner;

public class Question17 {
    //Rotate Matrix by 90 degree
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Column Size : ");
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        int[][] temp = new int[m][m];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.print("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat[i][j] = sc.nextInt();
                temp[i][j] = mat[i][j];
            }
        }
        for (int i = m-1;i>=0;i--){
            for (int j = 0;j<m;j++){
                mat[j][m-i-1] = temp[i][j];
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
