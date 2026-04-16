package TwoDArray;

import java.util.Scanner;

public class Question22 {
    //Boundary Elements
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Size of Column : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr[0][i] + " ");
        }
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i][m - 1] + " ");
        }
        for (int i = m - 2; i >= 0; i--) {
            System.out.print(arr[n - 1][i] + " ");
        }
        for (int i = n - 2; i > 0; i--) {
            System.out.print(arr[i][0] + " ");
        }

    }
}
