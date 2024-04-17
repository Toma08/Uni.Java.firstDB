/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secondhanddb;

/**
 *
 * @author 4-11-7-hallgato
 */
public class CarQuery {
    private String plateNumber;
    private String carType;
    private int price;
    private int year;
    private String brandName;

    public CarQuery(String plateNumber, String carType, int price, int year, String brandName) {
        this.plateNumber = plateNumber;
        this.carType = carType;
        this.price = price;
        this.year = year;
        this.brandName = brandName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarType() {
        return carType;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "CarQuery{" + "plateNumber=" + plateNumber + ", carType=" + carType + ", price=" + price + ", year=" + year + ", brandName=" + brandName + '}';
    }
    
    
}
