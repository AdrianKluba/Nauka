/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.Comparator;

/**
 *
 * @author Horikss
 */
public class Sorting implements Comparator<Book>{
    @Override
    public int compare(Book t, Book t1) {
       if(t.Price >t1.Price){
           return -1;
       }
        else if(t.Price < t1.Price){
           return 1;
         }
         return 0;
    }
    
}
