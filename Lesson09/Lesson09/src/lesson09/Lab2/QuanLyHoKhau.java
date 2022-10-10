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
public class QuanLyHoKhau {
    private SoHoKhau[] arrSoHoKhau;
    public int showMenu(){
        System.out.println("|============Menu============|");
        System.out.println("1. Khai báo sổ hộ khẩu");
        System.out.println("2. Danh sách sổ hộ khẩu");
        System.out.println("3. Tìm người");
        System.out.println("Vui lòng nhập từ 1--> 3");
        Scanner nhap = new Scanner(System.in);
        return nhap.nextInt();
    }
    public void khaiBaoSHK(){
        Scanner input = new Scanner(System.in);
        System.out.println("Khai bao so:");
        System.out.println("Nhap so SHK:");
        arrSoHoKhau = new SoHoKhau[input.nextInt()];
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            System.out.println("Nhap shk thu " + (i+1));
            System.out.println("Nhap so nhan khau:");
            int soNK = input.nextInt();
            arrSoHoKhau[i] = new SoHoKhau(soNK);
            arrSoHoKhau[i].nhapDuLieu();
        }
    }
    public void  danhSachSHK(){
        System.out.println("Danh sach:");
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            System.out.println("So thu :" + (i+1));
            arrSoHoKhau[i].hienThiDuLieu();
        }
    }
    public void timNguoi(){
        System.out.println("Tim nguoi:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        boolean flag = false;
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            SoHoKhau shk = arrSoHoKhau[i];
            for (int j = 0; j < shk.getArrThanhVien().length; j++) {
                HoKhau hk = (HoKhau) shk.getArrThanhVien()[j];
                if(hk.getHoTen().equals(name)){
                    System.out.println("So thu:"+(i+1));
                    hk.hienThiTT();
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("Khoong tim thayy");
        }
    }
    
    public static void main(String[] args) {
        int luaChon=0;
        QuanLyHoKhau quanLy = new QuanLyHoKhau();
        do{
            luaChon=quanLy.showMenu();
            switch(luaChon){
                case 1:
                    quanLy.khaiBaoSHK();
                    break;
                case 2:
                    quanLy.danhSachSHK();
                    break; 
                case 3:
                    quanLy.timNguoi();
                    break;
                
            }
        }while(luaChon>0 && luaChon<=3);
    }
}
