package TwoDArray;

import java.util.Scanner;

public class Question19 {
    // Search Element
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
        System.out.println("Enter Number want to Search : ");
        int b = sc.nextInt();
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (arr[i][j]==b){
                    System.out.println("Found");
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
}
