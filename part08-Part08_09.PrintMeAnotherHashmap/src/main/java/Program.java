
import java.util.HashMap;

public class Program {
    public static void printValues(HashMap<String, Book> hashmap) {
        for(Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for(Book book : hashmap.values()) {
            String bookName = book.getName();
            if(bookName.contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Test your program here!
    }

}
