package OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Question42 {
    // Minimum Platforms
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[n];
        System.out.println("Enter arrival times:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter departure times:");
        for(int i = 0; i < n; i++){
            dep[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int platforms = 0, maxPlatforms = 0;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        System.out.println("Minimum Platforms: " + maxPlatforms);
    }
}