package Class_Object;

class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String toString(){
        return ("Book : " + title + " by " + author);
    }
}

public class Question7 {
    public static void main(String[] args){
        Book b = new Book("1984","Orweell");
        System.out.println(b);
    }
}
