/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgextends.and.pkgimplements;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Horikss
 */
public class ExtendsAndImplements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<Monster> monsterList = Arrays.asList(
        new Fire(50, 20, 30, "Fire Elemental", 15),
        new Fire(60, 100, 50, "Fire Monk", 30),
        new Water(70, 30, 35, "Water Elemental", 5),
        new Water(40, 120, 55, "Water Monk", 20)
        );


    monsterList.stream().forEach(System.out::println);

    }
    
}
