/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112exam;

/**
 *
 * @author Student
 */
import java.util.*;
public class Prog6112Exam {

    public static int main(String[] args) {
        Scanner input = new Scanner(System.in);
        int companies = 3;
        int month = 3;
        int months[] = {1, 2, 3};
        String mattress[] = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int sales[][] = new int[companies][month];
        
        for(int i = 0; i < companies; i++){
            for(int p = 0; p < month; p++){
                System.out.print("Enter number of sales for month " + months[p] +" for " + mattress[i] + ": ");
                sales[i][p] = input.nextInt();
            }
            System.out.println("");
        }
        
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for(int p = 0; p < month; p++){
            total += sales[i][p];
            }
        }
        return total;
        
        double average;
        for (int i = 0; i < sales.length; i++) {
            for(int p = 0; p < month; p++){
            average += average[i][p];
            }
        }
  }
}

