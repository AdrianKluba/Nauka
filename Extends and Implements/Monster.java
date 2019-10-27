package pkgextends.and.pkgimplements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

/**
 *
 * @author Horikss
 */
public abstract class Monster {
    int speed;
    int hp;
    int mana;
    String name;

    public Monster(int speed, int hp, int mana, String name) {
        this.speed = speed;
        this.hp = hp;
        this.mana = mana;
        this.name = name;
    }
    
}
