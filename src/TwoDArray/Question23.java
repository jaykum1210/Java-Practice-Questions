package TwoDArray;

import java.util.Scanner;

public class Question23 {
    //Symmetric Matrix
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Size of Column : ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        int[][] temp = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                mat[i][j] = sc.nextInt();
                temp[i][j] = mat[i][j];
            }
        }
        for (int i = 0;i<m;i++){
            for (int j = i + 1; j < n; j++){
                int x = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = x;
            }
        }
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (mat[i][j]!=temp[i][j]){
                    System.out.println("Not A Symmetric Matrix");
                    return;
                }
            }
        }
        System.out.println("Symmetric Matrix");
    }
}
