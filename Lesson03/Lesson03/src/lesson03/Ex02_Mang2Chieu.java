/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Ex02_Mang2Chieu {
    public static void main(String[] args) {
        // mảng 2 chiều
        // 1. Khai báo
        int[][] arr;
        int[][] arr1 = new int[10][5];
        int[][] arr2 = {
            {10,20,30,40},
            {15,25,35,45},
            {11,22,33,44}
        };
        // 2. truy/xuất arr[i][j] =?
        // 3. Duyệt mảng
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%4d", arr2[i][j]);
            }
            System.out.println("\n");
        }
        
        // tính toán, tìm kiếm, ...
        // in biên, chéo chính, chéo phụ (vuông)
        
        // bài tập
        /*
            - Khai báo biến n
            - Khai bảo mảng 2 chiều gồm nxn phần tử
            - Sinh ngẫu nhiên mảng gồm nxn phần tử ,
                giá trị của mỗi phần tử là số nguyên
                có 2 chứ số [10 - 99] (random)
            - In danh sách các phần tử theo ma trận
            - in đường biên
            - in đường chéo (chéo chính, chéo phụ)
            - Tỉnh hiệu của 
                tongcheochinh - tongcheophu
            - In các phần tử có tổng chữ số chia hết cho 2,
                các phần từ khác  in bằng dấu *
        
            **  20  **  

            15  **  35  

            11  **  33  
        
            --15'
        */
        
//       Random rand =  new Random();
//       int num = rand.nextInt(89)+10;
//       System.out.println(num);
       int n;
        System.out.println("Nhập n=");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random rand =  new Random();
                int num = rand.nextInt(89)+10;
                array[i][j] = num;
            }
        }
        System.out.println("Ds các phần tử");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("Ds các phần tử biên");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j==0 || j==n-1 || i==n-1)
                    System.out.printf("%4d",array[i][j]);
                else
                    System.out.printf("%4s","**");
            }
            System.out.println("\n");
        }
        int tongcc=0, tongcp=0;
        System.out.println("Ds các phần tử chéo chính-phụ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i == n-j-1)
                    System.out.printf("%4d",array[i][j]);
                else
                    System.out.printf("%4s","**");
                
                if(i==j) tongcc +=array[i][j];
                if(i==n-j-1) tongcp += array[i][j];
            }
            System.out.println("\n");
        }
        
        System.out.println("Tổng cc: " + tongcc);
        System.out.println("Tổng co: " + tongcp);
        System.out.println("Hiệu: " + (tongcc-tongcp));
        
        
        System.out.println("Ds các phần tử ... chia 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int hc =(int)array[i][j]/10;
                int dv = array[i][j] % 10;
                
                if((hc+dv)%2==0)
                    System.out.printf("%4d",array[i][j]);
                else
                    System.out.printf("%4s","**");
            }
            System.out.println("\n");
        }
    }
}
