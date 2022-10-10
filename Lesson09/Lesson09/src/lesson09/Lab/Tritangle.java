/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.Lab;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Tritangle extends Shape{
    //field
    float height;
    float bottom;
    
    @Override
    public void inputData() {
      System.out.println("Nhập height:");
        Scanner input = new Scanner(System.in);
        height = input.nextFloat();
        System.out.println("Nhập bottom:");
        bottom = input.nextFloat();    
    }

    @Override
    public void calArea() {
    float area = bottom*height/2;
        System.out.println("Diện tích hình"
                + " tam giác: " + area);    
    }
    
}
