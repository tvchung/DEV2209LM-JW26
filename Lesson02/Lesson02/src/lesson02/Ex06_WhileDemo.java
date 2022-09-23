/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 */
public class Ex06_WhileDemo {
    public static void main(String[] args) {
        // Cấu trúc lặp while
        /*
        Cú pháp:
        while(condition){
            Statement;
        }
        */
        
        int n=5;
        System.out.printf("\n 1--%d\n",n);
        int i=1;
        while(i<=n){
            System.out.printf("%3d",i);
            i++;
        }
        
    }
}
