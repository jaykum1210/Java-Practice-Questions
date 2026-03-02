package JavaBasics;

public class Question68 {
    public static void main(String[] args) {
        int mul = 1;
        int i = 0;
        int base = Integer.parseInt(args[0]);
        int power = Integer.parseInt(args[1]);

        while (i<power) {
            mul*=base;
            i++;
        }
        System.out.println(mul);
    }
}
