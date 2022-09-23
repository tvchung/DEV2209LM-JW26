/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptulam;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Bài 3: Nhập 1 số nguyên n và một số thực m từ bàn phím 
 * và hiển thị giá trị vừa nhập ra màn hình
 */
public class Bai3 {
    public static void main(String[] args) {
        int soNguyen;
        float soThuc;
        //Nhập
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        soNguyen = input.nextInt();
        System.out.println("Nhập số thực:");
        soThuc = input.nextFloat();
        // Hiển thị
        System.out.println("Số nguyên:" + soNguyen);        
        System.out.println("Số thực:" + soThuc);

        
    }
}
