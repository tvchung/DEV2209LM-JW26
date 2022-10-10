/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.Lab2;

/**
 *
 * @author Chung Trinh
 */
public class SoHoKhau {
    private int soNhanKhau;
    private HoKhau[] arrThanhVien;

    public int getSoNhanKhau() {
        return soNhanKhau;
    }

    public void setSoNhanKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
    }

    public HoKhau[] getArrThanhVien() {
        return arrThanhVien;
    }

    public void setArrThanhVien(HoKhau[] arrThanhVien) {
        this.arrThanhVien = arrThanhVien;
    }

    public SoHoKhau() {
    }

    public SoHoKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
        this.arrThanhVien = new HoKhau[soNhanKhau];
    }
    
    public void nhapDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++) {
            arrThanhVien[i] = new HoKhau();
            arrThanhVien[i].nhapThongTin();
            
        }
    }
    public void hienThiDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++) {
            System.out.println("So ho khau thu:" + (i+1));
            HoKhau thanhVien = arrThanhVien[i];
            thanhVien.hienThiTT();
            
        }
    }
}

/*
if(thanhVien.getHoTen().equals("Tu")){
                thanhVien.hienThiTT();
            }
*/