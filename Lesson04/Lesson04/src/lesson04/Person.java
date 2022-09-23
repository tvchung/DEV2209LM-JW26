/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04;

/**
 *
 * @author Chung Trinh
 */
public class Person {
    
    // Field
    String personId;
    String name;
    float salary;
    
    // Constructor
    Person(){
        personId="";
        name="";
        salary=0;
    }
    Person(String personId, String name, float salary){
        this.personId=personId;
        this.name=name;
        this.salary = salary;
    }
    
    
    // Phương thức
    void printPerson(){
        System.out.println("=============");
        System.out.println("Mã:" + personId);
        System.out.println("Tên:" + name);
        System.out.println("Lương:" + salary);
    }
    
    
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Person p = new Person();
        p.printPerson();
        
        p = new Person("NV001","Chung Trinh", 1000);
        p.printPerson();
        
    }
}
