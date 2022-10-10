/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09;

/**
 *
 * @author Chung Trinh
 */
// Lớp cơ sở (Lớp cha)
public class Vehicle {
    // Field
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;
    
    //Method
    public void accelerate(int speed){
        System.out.println("Accelerate at : " 
         + speed +"Kmph");
    }
    
}
