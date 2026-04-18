package JavaMethods;

import java.util.Scanner;
import java.util.TreeMap;

public class Question30 {
    //Anagram
    String anagram(String str1, String str2){
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i=0;i<len1;i++){
            char ch = str1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for (int i = 0;i<len2;i++){
            char ch = str2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if (map1.equals(map2)) return "Yes";
        return "No";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question30 q = new Question30();
        System.out.println("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
        System.out.println(q.anagram(str1,str2));
    }
}
