/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author Paul
 */
public class Person {

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    private String firstName, lastName;
    
      
    BankAccount bankAccount = new BankAccount(); // Make array for multiple accounts.
    
}
