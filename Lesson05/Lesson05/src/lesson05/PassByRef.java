/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class PassByRef {
    public void calcArea(Circle objPI,double  rad){
        double area = objPI.getPI()*rad*rad;
        System.out.println("Area:" + area);
    }
    
    public static void main(String[] args) {
        PassByRef pb = new PassByRef();
        pb.calcArea(new Circle(), 0);
    }
}


class Circle{
    public double  getPI(){
        return 3.14;
    }
}