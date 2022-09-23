/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptulam;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Bài 6: Nhập 2 số nguyên n1, m1 ; 2 số thực n2, m2 từ bàn phím. 
 * Tính tổng của 2 số nguyên, tổng của 2 số thực, 
 * tính tổng của n1+n2 
 * và hiển thị các kết quả ra màn hình.
 */
public class Bai6 {
    public static void main(String[] args) {
        int n1,m1;
        float n2,m2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("n1=");
        n1=input.nextInt();
        System.out.println("m1=");
        m1=input.nextInt();
        System.out.println("n2=");
        n2=input.nextFloat();
        System.out.println("m2=");
        m2=input.nextFloat();
        
        // Tổng 2 số nguyên
        int iTong = n1+m1;
        // Tổng 2 số thực
        float fTong=n2+m2;
        // Tổng số nguyên và thực
        float fTong1 = n1+n2;
        System.out.println("Tổng nguyên:"+iTong);
        System.out.printf("\nTổng Thực:%.2f",fTong);
        System.out.println("\nTổng nguyên+Thực:"+fTong1);
        
        
    }
}
