/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson08;

/**
 *
 * @author Chung Trinh
 */
public class TestVehicle {
    public static void main(String[] args) {
        TwoWheeler objBike = 
                new TwoWheeler("CS-2737", "Bike");
        objBike.displayDetails();
        objBike.start();
        objBike.accellerate(80);
        objBike.brake();
        objBike.stop();
        
        TwoWheeler_1 obj = new TwoWheeler_1("CS-737", "Bike");
        obj.displayDetails();
        obj.start();
        obj.accellerate(80);
        obj.brake();
        obj.stop();
        obj.addContact("absdas");
        obj.makePayment(123123);
        obj.callManufacturer("0978611889");
                
    }
}
