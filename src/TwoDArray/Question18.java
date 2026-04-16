package TwoDArray;

import java.util.Scanner;

public class Question18 {
    // Multiply Matrix
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Column Size : ");
        int m = sc.nextInt();
        System.out.println("Enter Element at matrix 1");
        int[][] arr1 = new int[m][m];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.println("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Element at matrix 2");
        int[][] arr2 = new int[m][m];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.println("Enter Element at row " + (i+1) + " and column " + (j+1) + " : ");
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] mul = new int[m][m];
        for(int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                int sum = 0;
                for (int k = 0;k<m;k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                mul[i][j] = sum;
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
