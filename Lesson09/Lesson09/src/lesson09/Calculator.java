/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Calculator {
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        System.out.println("Input:");
        Scanner input = new Scanner(System.in);
        shape=input.nextLine();
        switch (shape) {
            case "circle":
                objShape = new Circle();
                objShape.calculate(10);
                objShape.show();
                break;
            case "rectangle":
                objShape = new Rectangle();
                objShape.calculate(123.3F);
                objShape.show();
                break;
            default:
                break;
        }
        
    }
}
