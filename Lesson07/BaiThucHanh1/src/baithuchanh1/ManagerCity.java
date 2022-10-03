/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class ManagerCity {
    public static void main(String[] args) {
        // menu
        int chon=0;
        List<City> list = new ArrayList<City>();
        do{
            System.out.println("======================\n" +
            "1. Nhập thông tin n thành phố\n" +
            "2. Hiển thị thông tin vừa nhập\n" +
            "3. Sắp xếp thông tin tăng dần theo tên nước.\n" +
            "4. Tìm kiếm thông tin theo cityId\n" +
            "5. Thoát.");
            System.out.print("Chọn:");
            Scanner input = new Scanner(System.in);
            chon =input.nextInt();
            switch(chon){
                case 1:
                    System.out.println("1. Nhập thông tin n thành phố");
                    City ct = new City();
                    ct.nhap();
                    list.add(ct);
                    break;
                case 2:
                    System.out.println("2. Hiển thị thông tin vừa nhập");
                    for (City city : list) {
                        city.hienThi();
                    }
                    break;
                case 3:
                    System.out.println("3. Sắp xếp thông tin tăng dần theo tên nước");
                   Collections.sort(list,(x,y)->{
                       return x.getCityName().compareTo(y.getCityName());} );
                    break;  
                case 4:
                    System.out.println("4. Tìm kiếm thông tin theo cityId");
                    System.out.print("Nhap ma can tim:");
                    input.nextLine();
                    String cityId = input.nextLine();
                    for (City city : list) {
                        if(city.getCityId().equals(cityId)){
                            city.hienThi();
                        }
                    }
                    break;  
                
                case 5:
                    System.out.println("5. Ket thuc");
                    break;
                default:
                    System.out.println("Ban nhap sai!");
                   
            }
        }while(chon!=5);
        
    }
    static class SortByName implements Comparator<City>
        {
            // Used for sorting in ascending order of
            // roll number
            public int compare(City a, City b)
            {
                if(a.getCityName().equals(b.getCityName()) ==true ){
                    return -1;
                }else{
                    return 1;
                }
            }
        }
}

