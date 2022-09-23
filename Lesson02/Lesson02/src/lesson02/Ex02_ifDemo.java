/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Ex02_ifDemo {
    public static void main(String[] args) {
        // Cấu trúc if (4 dạng if)
        int x, y;
        // Nhập xuất
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập x=");
        x=input.nextInt();
        System.out.print("Nhập y=");
        y=input.nextInt();
        
        // if đơn
        /*
            if(condition){
                statement - true;
            }
        */
        if(x>0){
            y +=x;
        }
        System.out.println("x="+x);       
        System.out.println("y="+y);
        // if đầy đủ
        /*
            if(condition){
                statement - true;
            }else{
                statement - false;
            }
        */
        if(x%2==0){
            System.out.println(x+ " là số chẵn");
        }else{
            System.out.println(x+ " là số lẻ");
        }
        
        // if bậc thang
        /*
            if(cond1){
                statement1;
            }else if(cond2){
                statement2;
            }...

            }else{

            }
        */
        if(x>0){
            System.out.println(x+ " là số dương");
        }else if(x==0){
            System.out.println("Số 0");
        }else{
            System.out.println(x+ " là số âm");
        }
        
        // if lồng nhau
        /*
        if(condition){
            statement1;
            if(....){....}
            statement2;
            ...
        }else{
            statement3;
        }
        */
        
        if(x>0){
            if(y%2==0){
                y++;
            }else{
                y--;
            }
            System.out.println("y="+y);
                    
        }else{
            System.out.println("Không tính");
        }
    }
}
/*
    bài tập: 
    1. Giải phương trình bậc 1: ax+b=0 (10')
    2. Giải phương trình bậc 2: ax2+bx+c=0

*/