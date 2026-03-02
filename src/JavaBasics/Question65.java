package JavaBasics;

public class Question65 {
    public static void main(String[] args) {
        int max = 0;
        if(Integer.parseInt(args[0])>Integer.parseInt(args[1])){
            max = Integer.parseInt(args[0]);
        }
        else{
            max = Integer.parseInt(args[1]);
        }
        System.out.print(max);
    }
}
