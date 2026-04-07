package OneDArray;

import java.util.HashMap;
import java.util.Scanner;

public class Question33 {
    //Majority Elements
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int e : arr){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for (int key : map.keySet()){
            if (map.getOrDefault(key,0)>a/2){
                System.out.println(key);
            }
        }
    }
}
