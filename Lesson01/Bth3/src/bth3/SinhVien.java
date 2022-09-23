/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth3;

import java.util.Scanner;


/**
 *
 * @author Chung Trinh
 */
public class SinhVien {
    public static void main(String[] args) {
        // Khai báo biến
        String tenSinhVien;
        int tuoi;
        float diemThiLyThuyet;
        float diemThiThucHanh;
        
        // Nhập thông tin
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên:");
        tenSinhVien = input.nextLine();
        System.out.println("Nhập tuổi:");
        tuoi=input.nextInt();
        System.out.println("Điểm lý thuyết:");
        diemThiLyThuyet = input.nextFloat();
        System.out.println("Điểm thực hành:");
        diemThiThucHanh = input.nextFloat();
        
        // Tính toán
        float dtb = (diemThiLyThuyet+diemThiThucHanh)/2;
        // Hiển thị
        System.out.println("Xin chào " + tenSinhVien + ";"
                + " tuổi:" + tuoi);
        System.out.println("Điểm trung bình:" + dtb);
    }
}
