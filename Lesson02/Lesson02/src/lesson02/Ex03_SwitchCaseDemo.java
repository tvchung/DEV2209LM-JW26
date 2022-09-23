/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Ex03_SwitchCaseDemo {
    public static void main(String[] args) {
        /*
            Cú pháp:
            switch(expression){
                case value1:
                    statement 1;
                    break;
                case value2:
                    statement 2;
                    break;
                case value3:
                    statement 3;
                    break;
                .....
                default:
                    statement;
            }
        */
        // ví dụ: 
        // in ra thứ trong tuần từ biến nguyên thứ nhập vào
        // thu: 1-7 => tên thứ
        
        int thu;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập thứ:");
        thu=input.nextInt();
        
        switch (thu) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            default:
                System.out.println("Bạn nhập sai");
                break;
        }
    }
}

/*
    bài tập:
    1. Nhập vào một số có 2 chữ số
    => Đọc thành lời việt
    10 => mười
    12 => mười hai
    25 => hai mươi lăm

    50 => năm mươi
    ....


    15 => 
        so1 = 15/10; =1
        so2 = 15%10; =5

    2. Phát triển lên việc đọc 3 số

    

*/