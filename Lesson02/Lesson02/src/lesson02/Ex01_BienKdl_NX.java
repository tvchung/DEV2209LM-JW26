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
public class Ex01_BienKdl_NX {
    public static void main(String[] args) {
        // khai báo biến
        int x,y;
        String name;
        
        // Nhập xuất
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập x=");
        x=input.nextInt();
        System.out.print("Nhập y=");
        y=input.nextInt();
        System.out.print("Nhập tên:");
        input.nextLine();
        name=input.nextLine();
        
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("Name:"+name);
        
        System.out.printf("\n x=%d \n y=%d \n Tên:%s\n",x,y,name);
        
        // toán tử
        // số học: +, -, *, / , %
        // so sánh: ==; !=; >;>=; <; <=;...
        // ....
        
        // Hỗn hợp
        
        int z = (x>y)?x:y;
        System.out.println("z="+z);
        
        float m;
        m= x + 1.2f;
        System.out.println("m="+m);
        
        z = y-(int)m;
        System.out.println("z="+z);
    }
}
