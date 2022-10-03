/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson07;

/**
 *
 * @author Chung Trinh
 */
public class NhanVienMainClass {
    public static void main(String[] args) {
        NhanVien[] nhanVien = new NhanVien[3];
        
        // Nhân viên thứ nhất
        nhanVien[0] = new NhanVien();
        nhanVien[0].name = "Nhân viên 1";
        nhanVien[0].cnt++;
         // Nhân viên thứ hai
        nhanVien[1] = new NhanVien();
        nhanVien[1].name = "Nhân viên 2";
        nhanVien[1].cnt++;
        // Nhân viên thứ ba
        nhanVien[2] = new NhanVien();
        nhanVien[2].name = "Nhân viên 3";
        nhanVien[2].cnt++;
        
        nhanVien[2].cnt++;
        // in
        for (NhanVien nv : nhanVien) {
            System.out.println(nv.name + "--->static cnt:" + nv.cnt);
        }
    }
}
