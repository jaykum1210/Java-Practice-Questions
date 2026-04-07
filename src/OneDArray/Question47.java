package OneDArray;

import java.util.Scanner;

public class Question47 {
    // Minimum Jumps to Reach End
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for(int i = 0; i < n - 1; i++){
            farthest = Math.max(farthest, i + arr[i]);
            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        System.out.println("Minimum Jumps: " + jumps);
    }
}