package TwoDArray;

import java.util.Scanner;

public class Question36 {
    // Count Islands

    public static void dfs(int[][] mat, int i, int j, int m, int n){
        if (i < 0 || j < 0 || i >= m || j >= n || mat[i][j] == 0){
            return;
        }
        mat[i][j] = 0;
        dfs(mat, i+1, j, m, n);
        dfs(mat, i-1, j, m, n);
        dfs(mat, i, j+1, m, n);
        dfs(mat, i, j-1, m, n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Enter element at (" + (i+1) + "," + (j+1) + "): ");
                mat[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] == 1){
                    count++;
                    dfs(mat, i, j, m, n);
                }
            }
        }
        System.out.println("Number of Islands = " + count);
    }
}