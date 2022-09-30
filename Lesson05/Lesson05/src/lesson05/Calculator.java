/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class Calculator {
    // Cộng
    public void cong(int num1, int num2){
        int num = num1+num2;
        System.out.printf("\n%d + %d = %d",
                num1,num2,num);
    }
    // trừ
     public void tru(int num1, int num2){
        int num = num1-num2;
        System.out.printf("\n%d - %d = %d",
                num1,num2,num);
    }
    // nhân
    public void nhan(int num1, int num2){
        int num = num1*num2;
        System.out.printf("\n%d x %d = %d",
                num1,num2,num);
    }
    // chia
    public void chia(int num1, int num2){
        float num =(float) num1/num2;
        System.out.printf("\n%d / %d = %.2f",
                num1,num2,num);
    }
    public static void main(String[] args) {
        // Test
        Calculator calc = new Calculator();
        calc.cong(100, 150);
        calc.tru(100, 150);
        calc.nhan(100, 150);
        calc.chia(100, 150);
        
    }
}
