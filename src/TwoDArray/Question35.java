package TwoDArray;

import java.util.Map;
import java.util.Scanner;

public class Question35 {
    // Diagonal Difference
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Matrix : ");
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.println("Enter Element at row " + (i+1) + " and column " + (j+1));
                mat[i][j] = sc.nextInt();
            }
        }
        int dia1 = 0;
        int dia2 = 0;
        for (int i = 0;i<m;i++){
            dia1+=mat[i][i];
            dia2+= mat[m-i-1][m-i-1];
        }
        System.out.println("Diagonal Difference : " + Math.abs(dia1-dia2));
    }
}
