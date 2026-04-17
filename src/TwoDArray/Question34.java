package TwoDArray;

import java.util.Scanner;

public class Question34 {
    //Rotate 180
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.println("Enter Element at row " + (i+1) + " and column " + (j+1));
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<m/2;i++){
            for (int j = 0;j<m;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[m-1-i][m-j-1];
                mat[m-1-i][m-j-1] = temp;
            }
        }
        if (m%2!=0){
            for (int i = 0;i<m/2;i++){
                int temp = mat[m/2][i];
                mat[m/2][i] = mat[m/2][m-i-1];
                mat[m/2][m-i-1] = temp;
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
