package OOPS;

import java.util.Scanner;

class Book{
    private String Title;
    private String Author;
    Book(String Title, String Author){
        this.Title = Title;
        this.Author = Author;
    }
    public void display(){
        System.out.println("Title : " + Title);
        System.out.println("Author : " + Author);
    }
}

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Author : ");
        String author = sc.nextLine();
        System.out.println("Enter Title : ");
        String title = sc.nextLine();
        Book book = new Book(title,author);
        book.display();
    }
}
