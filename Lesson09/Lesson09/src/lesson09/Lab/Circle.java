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
public class Circle extends Shape{
    float radius;

    @Override
    public void inputData() {
        System.out.println("Nhập bán kính:");
        Scanner input = new Scanner(System.in);
        radius = input.nextFloat();
    }

    @Override
    public void calArea() {
        float area = (float)(radius*radius*Math.PI);
        System.out.println("Diện tích hình tròn:"+
                area);
    }
    
}
