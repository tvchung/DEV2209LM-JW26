/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.Lab2;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class HoKhau extends NhanKhau{
    private String diaChiHienNay;
    private String diaChiCongTac;

    public HoKhau() {
    }

    public HoKhau( String hoTen, String ngaySinh, boolean gioiTinh,String diaChiHienNay, String diaChiCongTac) {
        super(hoTen, ngaySinh, gioiTinh);
        this.diaChiHienNay = diaChiHienNay;
        this.diaChiCongTac = diaChiCongTac;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap diaChiHienNay:");
        diaChiHienNay = input.nextLine();
        System.out.print("Nhap diaChiCongTac:");
        diaChiCongTac = input.nextLine();
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT(); 
        System.out.println("Ho khau{"
                +" dia chi hien nay:"+diaChiHienNay
                +" dia chi cong tac:" + diaChiCongTac
                + "}");
    }
    
    
    
}
