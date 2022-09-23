/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 * for
 * while
 * do...while
 * for...in
 * 
 */
public class Ex04_ForDemo {
    public static void main(String[] args) {
        /*
            Cú pháp:
            for(init ; condition ; step){
        
                statement;
        
            }
            .....
        */
        
        //ví dụ: in ra các số nguyên từ 1->10
        System.out.println("1");
        System.out.println("2");
        
        System.out.println("Số 1->10 ==");
        for(int i=1; i<=5 ; i++){
            System.out.printf("%3d",i);
        }
        // 4 dạng for
        // Dạng 1: for đầy đủ (như trên)
        
        // Dạng 2: for khuyết
        System.out.println("\n Khuyết Init");
        int j=1;
        for( ;j<=5;j++ ){
            System.out.printf("%3d",j);
        }
        
        System.out.println("\n Khuyết condition");
        for(j=1 ; ; j++ ){
            System.out.printf("%3d",j);
            if(j==5)
                break;
        }
        System.out.println("\n Khuyết step");
        for(j=1 ; j<=5 ;  ){
            System.out.printf("%3d",j);
            j++;
        }
        
        // Dạng 3: for khuyết toàn bộ
        j=1;
        System.out.println("\n Khuyết toàn bộ");
        for(;;){
            if(j>5)
                break;
            System.out.printf("%3d",j);
            j++;
        }
        
        // Dạng 4: for không thân
         System.out.println("\n for không thân");
        for(j=1; j<=5;System.out.printf("%3d",j),j++){}
        
        // Cấu trúc for lồng nhau
        // bên trong thần for, chứa cấu trúc for khacs
        
        // In bảng cửu chương
        for (int i = 2; i < 10; i++) {
            System.out.println("\nBảng CC :"+i);
            for (int k = 1; k <= 10; k++) {
                System.out.printf("\n %d x %d = %d",i,k,i*k);
            }
        }
    }
}

// nghỉ 5'

