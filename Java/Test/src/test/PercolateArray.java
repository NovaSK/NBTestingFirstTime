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
public class PercolateArray {
    
    public PercolateArray (int n) {
        
        int[][] array = new int[n][n];
        
        for (int i=0; i< n-1; i++) {
            System.out.println(array[i][i]);
        }
    }
}
