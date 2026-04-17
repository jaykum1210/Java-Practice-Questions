package TwoDArray;

import java.util.Scanner;

public class Question33 {
    //Fill Spiral
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of row : ");
        int m = sc.nextInt();
        int[] arr = new int[m*m];
        for (int i = 0;i<m*m;i++){
            System.out.println("Enter " +  (i+1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        int[][] mat = new int[m][m];
        int top = 0,bottom = m-1,left = 0,right = m-1;
        int num = 0;
        while ((top<=bottom) && (left<=right)){
            for (int i = left; i <= right; i++){
                mat[top][i] = arr[num++];
            }
            top++;
            for (int i = top; i <= bottom; i++){
                mat[i][right] = arr[num++];
            }
            right--;
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    mat[bottom][i] = arr[num++];
                }
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    mat[i][left] = arr[num++];
                }
                left++;
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
