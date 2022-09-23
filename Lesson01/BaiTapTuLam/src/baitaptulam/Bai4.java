/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptulam;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Bài 4: Nhập 1 số nguyên n, một số thực m, 
 * một xâu ký tự từ bàn phím và hiển thị giá trị vừa nhập ra màn hình.
 */
public class Bai4 {
    public static void main(String[] args) {
        int n;
        double m;
        String xau;
        // Nhập
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên n:");
        n=input.nextInt();
        System.out.println("Nhập số thực m:");
        m=input.nextDouble();
        System.out.println("Nhập một xâu:");
        input.nextLine();
        xau=input.nextLine();
        //In
        System.out.println("Số nguyên:" + n);        
        System.out.println("Số Thực:" + m);
        System.out.println("Xâu:" + xau);
    }
}
