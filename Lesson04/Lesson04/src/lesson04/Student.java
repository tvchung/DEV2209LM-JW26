/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Student {
    // Field
    String rollNumber;
    String name;
    int yearOfBirth;
    
    //Method
    // Nhập
    void InputStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã:");
        rollNumber= input.nextLine();
        System.out.println("Nhập tên:");
        name= input.nextLine();
        System.out.println("Nhập năm sinh:");
        yearOfBirth= input.nextInt();
    }
    
    //Xuất
    void printStudent(){
        System.out.println("=============");
        System.out.println("Mã:" + rollNumber);
        System.out.println("Tên:" + name);
        System.out.println("NS:" + yearOfBirth);
    }
    
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Student obj = new Student();
        
        // truy cập đến các field
        obj.rollNumber="SV001";
        obj.name="Devmaster";
        obj.yearOfBirth=2013;
        
        // Truy cập đến phương thức
        obj.printStudent();
        
        obj.InputStudent();
        obj.printStudent();
    }
}
