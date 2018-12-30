/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class CharCheck {

    public CharCheck() {
        this.list = new ArrayList<Character>();
        this.instance = new ArrayList<Character>();
    }
    
    public void CharCheck() { 
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string.");
        str = scan.next();
        
        for (int i = 0; i < str.length(); i++) {
            if (isList(str.charAt(i)) != -1) {
                instance.add(str.charAt(i));
                
                //System.out.println(str.charAt(i));
                //break;
            }
           // System.out.println(str.charAt(i));
        }
        index = list.indexOf(instance.get(0));
                
        for (int j = 0; j < list.size(); j++) {
            if (firstRepeater(list.get(j)) != -1) {
                System.out.println(list.get(j));
                break;
            }
        }
    }
    
    public int isList(char c) {
        
        index = list.indexOf(c);
        
        if ( index != -1) {
            this.instance.add(c);
            return index;
            
        }                   
        else {
            list.add(c);            
           // System.out.println(index);
            return index;  
        }                    
    }
    
    public int firstRepeater(char c) {
       
        return instance.indexOf(c);      
    }
    
    
    ArrayList<Character> list, instance;
    String str;
    char firstInstance ;
    int index;
    
}
