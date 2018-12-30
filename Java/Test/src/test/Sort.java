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
public class Sort {
    
    
    int[] array;
    int temp;
    
    public void Sort (int n) {
        
        generate(n);
                
    }
    
    public void generate (int n) {
        
        this.array = new int[n];
        
        for (int i = 0; i < n; i++) { 
            
            array[i] = (int) (Math.random() * 100);
        }
    }
    
    public void display(int[] a, int n) {
        
        for (int i = 0; i < a.length; i++) {
            if (n == i)
                System.out.print("\033[31m" + a[n] + " ");
            else 
                System.out.print("\u001B[0m" + a[i] + " ");
        }
        System.out.println();
    }
    
    public void bubbleSort() {
       
        for(int i=0; i < array.length; i++){  
                 for(int j=1; j < (array.length-i); j++){  
                          if(array[j-1] > array[j]){  
                                 //swap elements  
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                                 display(array, j );
                            }
                }
        }
    }
}
