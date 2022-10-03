/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devmaster;

// import packege
import luatdoanhnghiep.khoinhanuoc.tienluong.TienLuong;
/**
 *
 * @author Chung Trinh
 */
public class NhanVien {
    public static void main(String[] args) {
         int tham_nien_cong_tac=8;
         double luong = TienLuong.luongCoBan(TienLuong.BAC_DAI_HOC,
                 tham_nien_cong_tac);
         System.out.println("Lương nhân viên:" + luong);
         System.out.println("Phí BH:" + TienLuong.soTienBaoHiem(luong));
    }
}
