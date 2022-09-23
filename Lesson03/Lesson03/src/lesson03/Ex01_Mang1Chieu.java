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
public class Ex01_Mang1Chieu {
    public static void main(String[] args) {
        /*
            1. Khai báo
            datatype[] arrName;
            *) Khai báo và khởi tạo số phần tử
            datatype[] arrName = new datatype[size];
            *) Khai báo và khởi tạo giá trị
            datatype[] arrName = {value1;value2; value3;...};
        
            2. Truy xuất mảng
                Lấy: <param>= arrName[index];
                Gán: arrName[index] = <value>;
        
            3. Duyệt mảng => sử dụng vòng lặp (for, while, do...while, foreach)
                - nhập
                - xuất
                - tính toán
                - trích lọc
                - sắp xếp
                - Tìm kiếm
                - ....
        */
        /*
            Ví dụ:
            - Khai báo mảng gồm n phần tử nguyên 
            (n nhập từ bàn phím)
            - Nhập giá trị cho các phần tử trong mảng (<100)
                (Có thể sinh ngẫu nhiên)
            - In các phần từ trong mảng
            - Tính tổng các phần tử
            - In các phần tử có giá trị chi hết cho 3 va 5
            - In các phần tử là số nguyên tố, tính tổng
            --> 10'
        */
        int n=0;
        System.out.println("Nhập n=");
        Scanner input = new  Scanner(System.in);
        n=input.nextInt();
        int[] arr =new int[n];
        System.out.println("Nhập giá trị cho các phần tử");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]=",i);
            arr[i] = input.nextInt();
        }
        
        System.out.println("Ds cac phần tử trong mảng:");
        int tong=0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d",arr[i]);
            tong +=arr[i];
        }
        System.out.println("\n Tổng=" + tong);
        System.out.println("In các phần tử có giá trị chi hết 3, 5");
        for (int i = 0; i < n; i++) {
            if(arr[i] % 3 ==0 && arr[i] % 5 == 0){
                System.out.printf("%4d",arr[i]);
            }
        }
        System.out.println("\n");
        System.out.println("Ds các số nguyên tố\n");
        tong=0;
        for (int i = 0; i < n; i++) {
            if(checkNto(arr[i])==true){
                System.out.printf("%4d",arr[i]);
                tong +=arr[i];
            }
        }
        System.out.println("\n Tổng nguyên tố: " + tong);
    }
    
    // method
    static boolean checkNto(int num){
        boolean flag = true;
        if(num==1 || num ==2) return true;
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0 ){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
}
