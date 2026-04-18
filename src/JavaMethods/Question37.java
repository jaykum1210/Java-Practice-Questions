package JavaMethods;

import java.util.Scanner;

public class Question37 {
    // Two Sum (sorted array)
    int[] index(int[] arr, int num, int len){
        int left = 0;
        int right = len - 1;
        int[] temp = new int[2];
        while (left <= right){
            int sum = arr[left] + arr[right];
            if (sum == num){
                temp[0] = left;
                temp[1] = right;
                return temp;
            }
            else if (sum > num){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1, -1}; // not found
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question37 q = new Question37();
        System.out.println("Enter size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements (Sorted): ");
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Sum : ");
        int num = sc.nextInt();
        int[] ind = q.index(arr, num, a);
        if (ind[0] == -1){
            System.out.println("No pair found");
        } else {
            System.out.println("Indexes : " + ind[0] + " " + ind[1]);
        }
    }
}