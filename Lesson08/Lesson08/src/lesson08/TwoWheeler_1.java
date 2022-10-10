/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson08;

/**
 *
 * @author Chung Trinh
 */
public class TwoWheeler_1 implements 
            IVehicle, IManufacturer{
    //field
    String ID;
    String type;

    public TwoWheeler_1(String ID, String type) {
        this.ID = ID;
        this.type = type;
    }
    
    
    
    @Override
    public void start() {
        System.out.println("Starting the " + type);
    }

    @Override
    public void accellerate(int speed) {
        System.out.println("Accelerating at speed:"
                +speed+"kmph");
    }

    @Override
    public void brake() {
        System.out.println("Applying brakes");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + type);
    }
    
    
    public void displayDetails(){
        System.out.println("Vehicle No:" 
                + STARTID + " " + ID);
        System.out.println("Vehicle Type:" + type);
    }

    @Override
    public void addContact(String detail) {
        System.out.println("Add Contact: " + detail);
    }

    @Override
    public void callManufacturer(String phone) {
       System.out.println("Call : " + phone);
    }

    @Override
    public void makePayment(float amount) {
        System.out.println("make payment : " + amount);
    }
}
