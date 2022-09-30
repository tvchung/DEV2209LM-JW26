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
public class ListArrayListDemo {
    public static void printList(List<Integer> list){
        for (Integer item : list) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        // method
        list.add(100);
        list.add(200);
        list.add(150);
        list.add(120);
        list.add(120);
        list.add(550);
        // Hiển thị
        printList(list);
        //  get(int index)
        System.out.println("Index[1]:"+ list.get(1));
        //set(int index, E element)
        list.set(2,500);
        printList(list);
        //remove(int index)
        System.out.println("remove(int 0)");
        list.remove(0);
        printList(list);
        
        //subList(int start, int end)
        List<Integer> subList = list.subList(0, 2);
        System.out.println("subList(int start, int end)");
        printList(subList);
        
        //indexOf(Object o) 	
        System.out.println("Index="+list.indexOf(120));
        //lastIndexOf(Object o)
        System.out.println("lastIndexOf="+list.lastIndexOf(120));
        
        // sort
        System.out.println("Sort:");
        Collections.sort(list);
        printList(list);
        System.out.println("Sort Desc:");
        Collections.sort(list, (x,y)->{return y-x;});
        printList(list);
    }
}

// Bài thực hành
/*
    1. Tạo class Student(id, name, age)
    2. Tổ chức tập hợp các student trong ArrayList
        -> thêm
        -> Hiển thị
        -> Sắp xếp theo tuổi (age)

        15'???
*/