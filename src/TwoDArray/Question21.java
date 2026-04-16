package TwoDArray;

import java.util.Scanner;

public class Question21 {
    // Max Column Sum
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
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<n;i++){
            int sum = 0;
            for (int j = 0;j<m;j++){
                sum+=arr[j][i];
            }
            if (sum>max) max = sum;
        }
        System.out.println("Maximum Column Sum : " + max);
    }
}
