/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bth2;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Bth2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Vui lòng nhập tên của bạn");
        String tenCuaBan;
        Scanner input =  new Scanner(System.in);
        tenCuaBan = input.nextLine();
        System.out.println("Xin Chào " + tenCuaBan + ", "
                + "Chúc một ngày vui vẻ!");
    }
    
}
