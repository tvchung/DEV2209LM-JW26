/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chung Trinh
 */
public class Review {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Student st = new Student();
        st.printStudent();
        st = new Student("SV001", "Chung Trịnh", 45);
        st.printStudent();
    }
}
// lớp, đối tượng
class Student{
    // field
    String studentId;
    String name;
    int age;
    // constructor
    public Student(){
        studentId="";
        name="";
        age=0;
    }
    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    // method
    
    public void printStudent(){
        System.out.println("======THÔNG TIN:");
        System.out.println("Student ID:" + studentId);
        System.out.println("Student Name:" + name);
        System.out.println("Student Age:" + age);
    }
}