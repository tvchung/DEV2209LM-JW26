/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson06;

/**
 *
 * @author Chung Trinh
 */
public class Lesson06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MayTinh mt = new MayTinh();
        int res = mt.add(100, 120);
        System.out.println(res);
        res=mt.add(100, 200, 300);
        System.out.println(res);
        float res1 = mt.add(12.2f, 12.3f);
        System.out.println(res1);
    }
    
}
// review: Lesson05 - Polymorphism (Overloading) - Access Modifier [Public, Private, protected,default]
class MayTinh{
    // overload
    int add(int a, int b){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }
    int add(int a, int b , int c){
        return a+b+c;
    }
    
    float add(int a, float b){
        return a+b;
    }
}
       