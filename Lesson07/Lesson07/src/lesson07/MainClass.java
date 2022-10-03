/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson07;

/**
 *
 * @author Chung Trinh
 */
public class MainClass {
    
    final float PI=3.14f; // Khai báo hằng số PI
    
    public void display(float pi){
        // PI=pi; // error
        System.out.println("PI = " + PI);
    }
    
    
    public static void main(String[] args) {
        MainClass mc = new MainClass();
        mc.display(3.1415f);
    }
}
