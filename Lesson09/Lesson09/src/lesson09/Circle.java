/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09;

/**
 *
 * @author Chung Trinh
 */
public class Circle extends Shape{
    float area;
    @Override
    void calculate(float val) {
        area = getPI()*val*val;
        System.out.println("Area of circle is:" + area);
    }
}
