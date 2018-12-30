/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Paul
 */
public class FizzBuzz {
    
    public void FizzBuzz() { 
        
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            if (i%3 == 0) 
                System.out.print("Fizz");
            if (i%5 == 0) 
                System.out.print("Buzz");
            System.out.println();
        }        
        
    }
    
}
