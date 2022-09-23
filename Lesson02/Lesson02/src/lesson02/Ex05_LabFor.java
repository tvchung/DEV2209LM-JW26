/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 */
public class Ex05_LabFor {
    public static void main(String[] args) {
        // in ra tam giá *
        /*
            n=5
        
            *
            * *
            * * *
            * * * *
            * * * * *
    
        */
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
            n=5
        
            * * * * *
            * * * *
            * * *
            * * 
            * 
        */
        System.out.println("");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
            n=5
        
                    *
                  * *
                * * *
              * * * *
            * * * * *
        */
        
        System.out.println("");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
/*
Bài tập:1 
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

Bài tập:2 
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/