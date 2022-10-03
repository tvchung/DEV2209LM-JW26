/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chung Trinh
 */
public class Lesson07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        
        System.out.println(list);
        
        for (Integer item : list) {
            System.out.println(item);
        }
        
    }
    
}
