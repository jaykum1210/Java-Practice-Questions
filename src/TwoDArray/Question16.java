package TwoDArray;

import java.util.Scanner;

public class Question16 {
    // Spiral Traversal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Column : ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        System.out.println("Spiral Order : ");
        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++){
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}