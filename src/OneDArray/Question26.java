package OneDArray;

import java.util.Scanner;

public class Question26 {
    //SumArray Sum
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Sum : ");
        int b = sc.nextInt();
        for (int i = 0;i<a;i++){
            int sum = arr[i];
            if (sum==b){
                System.out.println("Found");
                return;
            }
            else{
                for (int j = i+1;j<a;j++){
                    sum+=arr[j];
                    if (sum==b) {
                        System.out.println("Found");
                        return;
                    }
                    else if(sum>b){
                        break;
                    }
                }
            }
        }
        System.out.println("Not Found");
    }
}
