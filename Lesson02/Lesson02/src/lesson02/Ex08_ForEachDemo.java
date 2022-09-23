/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 */
public class Ex08_ForEachDemo {
    public static void main(String[] args) {
        String[] str={"Hùng","Dũng","Sang","Trọng"};
        System.out.println("Danh sách");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("Danh sách");
        for (String s : str) {
            System.out.println(s);
        }
        
        
    }
}
