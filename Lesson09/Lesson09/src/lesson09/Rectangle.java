/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09;

/**
 *
 * @author Chung Trinh
 */
public class Rectangle extends Shape{
    // field
    float perimeter;
    float length=10;
    @Override
    void calculate(float width) {
        perimeter = 2*(length+width);
        System.out.println("Perimeter:" + 
                perimeter);
    }
}
