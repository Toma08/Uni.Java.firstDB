/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondhanddb;

import java.util.List;

/**
 *
 * @author 4-11-7-hallgato
 */
public class SecondHandDB {

    public static void main(String[] args) {
        CarManager cm=new CarManager();
        List<Car> cars=cm.getAllCars();
        for(Car car:cars){
            System.out.println(car.toString()); 
        }
        System.out.println("");
        CarManager cm2=new CarManager();
        List<CarBrand> brands=cm2.getAllCarBrands();
        for(CarBrand brand:brands){
            System.out.println(brand.toString());
            
    }
        System.out.println("");
        CarManager cm3=new CarManager();
        List<CarQuery> queries=cm3.getAll();
        for(CarQuery query:queries){
            System.out.println(query.toString());
            
    }
}}
