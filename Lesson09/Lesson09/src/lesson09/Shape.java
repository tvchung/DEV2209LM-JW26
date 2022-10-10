/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09;

/**
 *
 * @author Chung Trinh
 */
public abstract class Shape {
    private final float PI=3.14F;
    
    public float getPI(){
        return PI;
    }
    // abstract method
    abstract  void calculate(float val);
    
    // normal method
    public void show(){
        System.out.println("lesson09.Shape.show()");
    }
}
