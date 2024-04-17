/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secondhanddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 4-11-7-hallgato
 */
public class CarManager {
    private final String url="jdbc:sqlite:SecondHand.db";
    
    public List<CarQuery> getAll(){
        try {
            Statement st=getStatement();
            List<CarQuery> carQueries=new ArrayList<>();
            boolean isQuery=st.execute("Select c.PlateNumber, b.BrandName, c.CarType, c.Price, c.Year From Cars as c INNER JOIN CarBrands as b ON c.CarBrandID=b.Id");
            ResultSet rs=st.getResultSet();
            
            while(rs.next()){
                String plateNumber= rs.getString("PlateNumber");
                String CarType= rs.getString("CarType");
                String brandName= rs.getString("BrandName");
                int price= rs.getInt("Price");
                int year= rs.getInt("Year");
                int carBrand= rs.getInt("CarBrandId");
                
                carQueries.add(new CarQuery(plateNumber, CarType, price, year, brandName));
                
            }
            return carQueries;
        } catch (SQLException e) {
            System.out.println("Hiba: "+e.getMessage());
            return null;
        }
    }
    
    public List<Car> getAllCars(){
        try {
            Statement st=getStatement();
            List<Car> cars=new ArrayList<>();
           
            ResultSet rs=st.executeQuery("SELECT * FROM Cars");
             while(rs.next()){
                String plateNumber=rs.getString("PlateNumber");
                String carType=rs.getString("CarType");
                int price=rs.getInt("Price");
                int year=rs.getInt("Year");
                int carBrandId=rs.getInt("CarBrandId");
                
                Car car= new Car(plateNumber, carType, price, year, carBrandId);
                cars.add(car);
            }
             return cars;
        } catch (SQLException e) {
            System.out.println("Hiba történt:"+e.getMessage());
            return null;
        }
        
    }
    public List<CarBrand> getAllCarBrands(){
        try {
            Statement st=getStatement();
            List<CarBrand> brands=new ArrayList<>();
           
            ResultSet rs=st.executeQuery("SELECT * FROM CarBrands");
             while(rs.next()){
                int brandId=rs.getInt("Id");
                String brandName=rs.getString("BrandName");
                String description=rs.getString("Description");
                
                CarBrand brand= new CarBrand(brandId,brandName,description);
                brands.add(brand);
            }
             return brands;
        } catch (SQLException e) {
            System.out.println("Hiba történt:"+e.getMessage());
            return null;
        }
        
    }
    
    private Statement getStatement()throws SQLException{
        Connection connection = DriverManager.getConnection(url);
        Statement st = connection.createStatement();
        return st;
    }
}
