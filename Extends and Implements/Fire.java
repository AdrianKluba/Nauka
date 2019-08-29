/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgextends.and.pkgimplements;

/**
 *
 * @author Horikss
 */
public class Fire extends Monster implements FireResist {
    int Attack;
    
    public Fire(int speed, int hp, int mana, String name, int Attack) {
        super(speed, hp, mana, name);
        this.Attack = Attack * dmg;
    }
  
    
    @Override
    public String toString(){
        return "Name: " + name + clas + " HP: " + hp + " Mana: " + mana+ " Speed: " + speed + " Fire Attack: " +Attack
            + " Extra damage from water: +" + waterResist+"% "+ "Fire Resist: "+ fireResist+"%";
         }


    
}
