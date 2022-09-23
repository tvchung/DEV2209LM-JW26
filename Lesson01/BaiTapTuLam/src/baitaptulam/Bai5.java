/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptulam;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Bài 5: Nhập 2 số nguyên n, m từ bàn phím 
 * và hiển thị kết quả là tổng của 2 số này.
 */
public class Bai5 {
    public static void main(String[] args) {
        int n,m;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập n=");
        n=input.nextInt();
        System.out.println("Nhập m=");
        m=input.nextInt();
        
        int tong=n+m;
        System.out.println("Tong:" + tong);
    }
}
