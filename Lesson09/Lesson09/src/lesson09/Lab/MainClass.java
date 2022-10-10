/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.Lab;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class MainClass {
    public int showMenu(){
        System.out.println("|============= MENU =============|");
        System.out.println("1. Tính diện tích hình tròn");
        System.out.println("2. Tính diện tích hình tứ giác");
        System.out.println("3. Tính diện tích hình tam giác");
        System.out.println("4. Thoats ");
        
        System.out.println("Vui lòng chọn từ 1 --> 3");
        Scanner nhap = new Scanner(System.in);
        return nhap.nextInt();
    }
    public void tinhDienTich(Shape hinh){
        hinh.inputData();
        hinh.calArea();
    }
    
    //test
    public static void main(String[] args) {
        int luaChon=0;
        MainClass mc =new MainClass();
        do{
            luaChon = mc.showMenu();
            switch (luaChon) {
                case 1:
                    mc.tinhDienTich(new Circle());
                    break;
                case 2:
                    mc.tinhDienTich(new Rectangle());
                    break; 
                case 3:
                    mc.tinhDienTich(new Tritangle());
                    break; 
                case 4:
                    System.exit(luaChon);
                default:
                    throw new AssertionError();
            }
        }while(luaChon !=4);
    }
}
