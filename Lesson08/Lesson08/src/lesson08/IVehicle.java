/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lesson08;

/**
 *
 * @author Chung Trinh
 */
public interface IVehicle {
    static final String STARTID="LA-09";
    
    //method - abstract
    public void start();
    public void accellerate(int speed);
    public void brake();
    public void stop();
}
