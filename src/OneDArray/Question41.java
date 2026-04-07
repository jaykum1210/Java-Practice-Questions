package OneDArray;

import java.util.HashMap;
import java.util.Scanner;

public class Question41 {
    // Longest Subarray with Equal 0s and 1s
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements (0s and 1s):");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                sum += -1;
            } else {
                sum += 1;
            }
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }
        System.out.println("Longest Length: " + maxLen);
    }
}