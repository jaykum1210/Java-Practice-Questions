package JavaBasics;

public class Question66 {
    public static void main(String[] args){
        int min = 99999;
        if(Integer.parseInt(args[0])<Integer.parseInt(args[1])){
            min = Integer.parseInt(args[0]);
        }
        else{
            min = Integer.parseInt(args[1]);
        }
        System.out.print(min);
    }
}
