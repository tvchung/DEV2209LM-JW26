/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson03;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Ex00_Review {
    public static void main(String[] args) {
        // - biến, hằng, kiểu dữ liệu, toán tử, toán hạng
        // biểu thức, câu lệnh, khối lệnh 
        // - Nhập xuất (Scanner / println, print, printf...)
        // - Các cấu trúc điều khiển
        // *) 3 loại cấu trúc điều khiển
        //1. Lựa chọn rẽ nhánh
        //      if / switch
        //      if: 4 dạng if
        //      switch 
        //2. Loop
        //  for (4 dạng)
        //  while
        //  do...while
        //  for ... in 
        //3. Lệnh nhảy
        //  break
        //  continue
        //  return
        //  exit
        
        
        // => mảng trong ngôn ngữ lập trình
        
        // bài tập:
        /*
            - Nhập n nguyên dương
            - In ra các số nguyên dương 1-n
            - In ra các số nguyên tố trong khoảng [1-n], 
            -   và tính tổng các số nguyên tố.
            -> 10'
        */
        
        int n;
        int tong=0;
        System.out.println("Nhập n=");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        
        System.out.println("1...."+n);
        for (int i = 1 ; i <= n; i++) {
            System.out.printf("%3d",i);
        }
        
        System.out.println("\n Số nguyên tố");
        
        for (int i = 2; i <= n; i++) {
            boolean flag=true;
            for (int j = 2; j <= i/2; j++) {
                if(i%j == 0){
                    flag= false;
                    break;
                }
            }
            if(flag==true){
                System.out.printf("%3d",i);
                tong +=i;
            }
        }
        System.out.println("\n Tổng:"+tong);
    }
}
