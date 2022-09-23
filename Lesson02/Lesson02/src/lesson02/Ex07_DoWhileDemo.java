/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 */
public class Ex07_DoWhileDemo {
    public static void main(String[] args) {
        /*
            cú pháp:
        do{
            statement;
        }while(condition);
        
        */
        int n=5;
        System.out.printf("\n 1--%d\n",n);
        int i=1;
        do{
            System.out.printf("%3d",i);
            i++;
        }while(i<=n);
        
    }
}
