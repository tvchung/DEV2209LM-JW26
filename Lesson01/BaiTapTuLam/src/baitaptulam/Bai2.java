/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptulam;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Bài 2: Nhập 1 số nguyên n từ bàn phím và hiển thị giá trị vừa nhập ra màn hình.
 */
public class Bai2 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một số:");
        num = input.nextInt();
        System.out.println("Só vừa nhập: " + num);
    }
}
