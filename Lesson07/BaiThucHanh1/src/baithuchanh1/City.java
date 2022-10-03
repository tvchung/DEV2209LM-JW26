/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh1;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class City {
    private String cityId;
    private String cityName;
    private String country;
    private double area;

    public City() {
    }

    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void nhap(){
        Scanner input = 
                new Scanner(System.in);
        System.out.println("Nhập city id:");
        cityId=input.nextLine();
        System.out.println("Nhập city name:");
        cityName=input.nextLine();
        System.out.println("Nhập country:");
        country=input.nextLine();
        System.out.println("Nhập area:");
        area=input.nextDouble();
    }
    public void hienThi(){
        System.out.println("=======");
        System.out.println("ID:" + cityId);
        System.out.println("Name:" + cityName);
        System.out.println("Country:" + country);
        System.out.println("Area:" + area);
    }
}
