/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Chung Trinh
 */
public class SortedSetExample {
    public static void main(String[] args)
    {
        SortedSet<String> ts
            = new TreeSet<String>();
  
        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
        System.out.println(ts);
        // Adding the duplicate
        // element
        ts.add("India");
  
        // Displaying the TreeSet
        System.out.println(ts);
  
        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + ts);
  
        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        
        System.out.println("Foreach set:");
        for (String t : ts) {
            System.out.println(t);
        }
        
//        SortedSet<Student> ss
//            = new TreeSet<Student>();
//        
//        ss.add(new Student("SV101", "Chung Chung", 45));
////        System.out.println("Foreach set:");
////        for (Student st : ss) {
////            st.output();
////        }
//        System.out.println("Iterating over set:");
//        Iterator<Student> is = ss.iterator();
//        while (is.hasNext())
//           is.next().output();
        
    }
}
