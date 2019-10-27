/*
Library with enum + ArrayList + CompareTo + string toString 
 */ 
package Library;

/**
 *
 * @author Horikss
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListB book = new ListB();
        book.putList(new Book(Autor.Sapkowski,Description.Book_about_game_Witcher,32));
        book.putList(new Book(Autor.Autor2,Description.IDK,21));
        book.putList(new Book(Autor.Autor3,Description.Somethin,25));
        System.out.println("Before sorting");
        book.showlist();
        
        book.sortbyPrice();
        System.out.println("After sorting");
        book.showlist();
       
        
    }

  
    
}
