/*
Library with stream and lambda
 */
package library.v2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Horikss
 */
public class LibraryV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Book> bookList = Arrays.asList(
                new Book("Sapkowski","Book about game Witcher", false, 11),
                new Book("Sapkowski","The Witcher", true, 40),
                new Book("Graham McNeill", "Empire", false,10)
        );
         bookList.stream()
                .filter(Book -> Book.isBorrow() == true)
                .filter(Book -> Book.getPrice() < 50)
                .filter(Book -> Book.getAuthor().equals("Sapkowski"))
                .map(Book -> Book.getAuthor() + " " + Book.getDescription() + " " + Book.isBorrow() + " " + Book.getPrice())
                .forEach(System.out::println);
         
                
    }
    
}
