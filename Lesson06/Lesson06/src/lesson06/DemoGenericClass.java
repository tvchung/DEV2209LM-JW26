/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

/**
 *
 * @author Chung Trinh
 */
public class DemoGenericClass<T> {
    
    private T bienKieuT;
    
    public void set(T t){
        this.bienKieuT = t;
    }
    public T get(){
        return bienKieuT;
    }
    
    public static void main(String[] args) {
        DemoGenericClass<Integer> 
                iArray =  new DemoGenericClass<Integer>();
        iArray.set(new Integer(10));
        
        System.out.println(iArray.get());
        
        DemoGenericClass<String> str
                = new DemoGenericClass<String>();
        str.set("hello");
        System.out.println(str.get());
                
        
    }
}
