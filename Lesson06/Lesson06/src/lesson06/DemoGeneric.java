/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

/**
 *
 * @author Chung Trinh
 */
public class DemoGeneric {
    // Method generic
    public static <E> void printArray(E[] arr){
        for (E e : arr) {
            System.out.printf("%6s",e);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Integer[] iArray = {10,20,30,40};
        printArray(iArray);
        
        Double[] dArray = {10.1d,20.2d,30.3d,40.4d};
        printArray(dArray);
        
        String[] str = {"Hùng","Dũng","Sang","Trọng"};
        printArray(str);
        
    }
}
