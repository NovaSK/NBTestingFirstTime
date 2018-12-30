package assignment.pkg1.percolation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import static java.io.FileDescriptor.in;
import static java.lang.System.in;
import static javax.management.Query.in;

/**
 *
 * @author Paul
 */
public class Percolation {

    private final int[][] array;
    
    WeightedQuickUnionUF quickUnion;
    
   public Percolation(int n) {                // create n-by-n grid, with all sites blocked
       
       array = new int[n][n];       
   }
   
   public void open(int row, int col) {    // open site (row, col) if it is not open already
              
       array[row][col] = 1;
   }
   
   public boolean isOpen(int row, int col) {  // is site (row, col) open?
       
        return array[row][col] != 0;      
   }
   
   public boolean isFull(int row, int col) {  // is site (row, col) full?
      
       return array[row][col] != 0;      
   }
   
   public int numberOfOpenSites() {      // number of open sites
       
       return quickUnion.count();       
   }
   public boolean percolates() {             // does the system percolate?
       return false;
       
   }

   public static void main(String[] args) {   // test client (optional)
       
       
   }
}
