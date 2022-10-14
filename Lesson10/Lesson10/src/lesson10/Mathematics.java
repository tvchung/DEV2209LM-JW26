/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Mathematics {
    // chia 2 số
//    public void divide(int num1, int num2){
//        int res = num1/num2;
//        System.out.println("Res:"+res);
//           System.out.println("Finish");
//    }
    public void divide(int num1, int num2){
        try{
            int res = num1/num2;
            System.out.println("Res:"+res);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Finish");
    }
    
    public void chia(int n1, int n2) 
            throws ArithmeticException{
        if(n2 ==0 ){
            throw new ArithmeticException("Loi chia cho 0");
        }else{
            System.out.println("res:"+ (n1/n2));
        }
        
        System.out.println("Finish - chia");
    }
    public static void main(String[] args) {
        Mathematics math = new Mathematics();
        math.divide(10, 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        int num1=input.nextInt();
        System.out.println("Nhap so thu hai:");
        int num2=input.nextInt();
        math.divide(num1, num2);
        math.chia(num1,num2);
    }
}
