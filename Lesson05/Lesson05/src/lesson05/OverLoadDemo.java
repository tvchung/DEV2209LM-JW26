/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class OverLoadDemo {
    public static void main(String[] args) {
        MayTinh mt  = new MayTinh();
        mt.Cong(10, 20.3f);
    }
}
class MayTinh{
    
    public void Cong(int a, int b){
        int c=a+b;
        System.out.printf("\n %d + %d = %d",a,b, c);
    }
    public void Cong(float a, float b){
        float c=a+b;
        System.out.printf("\n %f + %f = %f",a,b, c);
    }
    public void Cong(int a, float b){
        float c=a+b;
        System.out.printf("\n %d + %f = %f",a,b, c);
    }
    public void Cong(float a, int b){
        float c=a+b;
        System.out.printf("\n %f + %d = %f",a,b, c);
    }
}