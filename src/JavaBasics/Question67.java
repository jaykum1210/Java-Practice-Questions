package JavaBasics;

public class Question67 {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        while(i<5){
            sum+=Integer.parseInt(args[i]);
            i++;
        }
        System.out.println(sum);
    }
}
