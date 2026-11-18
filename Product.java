/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112exam;

/**
 *
 * @author Student
 */
public abstract class Product implements IProducts{

    @Override
    public String GetMostPopularProduct(String[] popular){
       
        return null;
       
    }
    
    @Override
    public abstract double GetAverageProductsSold(double[] averageSold);

    @Override
    public int getTotalProductsSold(int[] productsSold){
        int total = 0;

        for (int i = 0; i < productsSold.length; i++) {
            total += productsSold[i];
        }
        return total;
    }

    
    
}
