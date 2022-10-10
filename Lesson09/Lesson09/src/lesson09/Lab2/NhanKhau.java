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
public class NhanKhau {
    private String hoTen;
    private String ngaySinh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    private boolean gioiTinh;

    public NhanKhau() {
    }

    public NhanKhau(String hoTen, String ngaySinh, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
    
    public void nhapThongTin(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten:");
        hoTen = input.nextLine();
        System.out.print("Nhap ngay sinh:");
        ngaySinh = input.nextLine();
        System.out.print("Nhap gtinh:");
        gioiTinh = input.nextBoolean();     
    }
    public void hienThiTT(){
        System.out.println("NhanKhau{"
        + "Ho va ten:" + hoTen
        +", Ngay sinh:" + ngaySinh
        +", gioi tinh:" + gioiTinh +"}");
    }
}
