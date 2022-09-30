/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Chung Trinh
 */
public class ListObjectDemo {
    public static void printInfo(List<Student> list){
        System.out.println("\n Danh sách:");
        for (Student student : list) {
            student.output();
        }
    }
    
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        // Thêm đối tượng sinh viên vào list
        list.add(new Student("SV001", "Chung Trịnh", 45));
        Student st = new Student("SV002", "Devmaster", 5);
        list.add(st);
        st = new Student("SV003", "Academy", 10);
        list.add(st);
        
        // Hiển thị danh sách
        printInfo(list);
        // Sắp xếp
        Collections.sort(list, (x,y)-> {return x.age-y.age;});
        printInfo(list);
        Collections.sort(list, (x,y)-> {return y.age-x.age;});
        printInfo(list);
        
        // remove
        for (Student student : list) {
            if(student.id.equals("SV002")){
                list.remove(student);
                break;
            }
        }
        
         printInfo(list);
    }
}
class Student{
//    field
    String id;
    String name;
    int age;
    
    public Student(){}

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public void output(){
        System.out.printf("\n %10s %15s %5d",id,name,age);
    }
}