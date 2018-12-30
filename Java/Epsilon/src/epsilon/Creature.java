/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsilon;

/**
 *
 * @author Paul
 */
public class Creature {

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHitPoints() {
        return hitPoints;
    }
    
    String name;
    int age;
    double hitPoints;
    
}
