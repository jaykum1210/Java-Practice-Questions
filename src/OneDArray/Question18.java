package OneDArray;

import java.util.*;

public class Question18 {
    //Frequency Count
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<a;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}