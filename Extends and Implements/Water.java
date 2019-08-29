/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgextends.and.pkgimplements;

import static pkgextends.and.pkgimplements.FireResist.dmg;



/**
 *
 * @author Horikss
 */
public class Water extends Monster implements WaterResist {
    int Attack;

    public Water(int speed, int hp, int mana, String name, int Attack) {
        super(speed, hp, mana, name);
        this.Attack = (int) (Attack * dmg);
    }
    @Override
    public String toString(){
        return "Name: " + name + clas + " HP: " + hp + " Mana: " + mana+ " Speed: " + speed + " Water Attack: " +Attack 
            + " Extra damage from fire: "+ fireResist+"%"+ " Water Resist: +" + waterResist+"% ";
         }
    
}
