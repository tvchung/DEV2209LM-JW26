/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09;

/**
 *
 * @author Chung Trinh
 */
public class FourWheeler extends Vehicle{
    // field 
    private boolean powerSteer;
    public FourWheeler(String vld,
            String vName,
            int numWheeles,
            boolean  pSteer){
        // field của lớp cha
        vehicleNo=vld;
        vehicleName=vName;
        wheels=numWheeles;
        // field lớp con
        powerSteer = pSteer;
    }
    // method 
    public void showDetail(){
        System.out.println("Vehicle No:" 
                + vehicleNo);
        System.out.println("Vehicle Name:" 
                + vehicleName);
        System.out.println("Wheels:" + wheels);
        if(powerSteer == true){
            System.out.println("Power Steering:Yes");
        }else{
            System.out.println("Power Steering:No");
        }
    }
    
    // test
    public static void main(String[] args) {
        FourWheeler objFour =
                new FourWheeler("LA-09 CS-1406", 
                        "Volkwagen",
                        4, true);
        objFour.showDetail();
        objFour.accelerate(200);
        
        Vehicle v = new Vehicle();
        //v.showDetail();
        
    }
}
