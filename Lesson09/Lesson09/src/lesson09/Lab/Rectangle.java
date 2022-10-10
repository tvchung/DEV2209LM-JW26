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
public class Rectangle extends Shape{
    float width;
    float height;
    @Override
    public void inputData() {
        System.out.println("Nhập width:");
        Scanner input = new Scanner(System.in);
        width = input.nextFloat();
        System.out.println("Nhập height:");
        height = input.nextFloat();
    }

    @Override
    public void calArea() {
        float area = width*height;
        System.out.println("Diện tích hình"
                + " chữ nhật là: " + area);
    }
}
