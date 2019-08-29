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
        
        List<book> lista = Arrays.asList(
                new book("Sapkowski","Book about game Witcher", false, 11),
                new book("Sapkowski","The Witcher", true, 40),
                new book("Graham McNeill", "Empire", false,10)
        );
         lista.stream()
                .filter(book -> book.isBorrow() == true)
                .filter(book -> book.getPrice() < 50)
                .filter(book -> book.getAuthor().equals("Sapkowski"))
                .map(book -> book.getAuthor() + " " + book.getDescription() + " " + book.isBorrow() + " " + book.getPrice())
                .forEach(System.out::println);
         
                
    }
    
}
