package Class_Object;

import java.util.Scanner;

class ClassRoom{
    int[] arr;
    double average(){
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (sum/arr.length);
    }
}

public class Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ClassRoom cr = new ClassRoom();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        cr.arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            cr.arr[i] = sc.nextInt();
        }
        System.out.println("Average : " + cr.average());
    }
}
