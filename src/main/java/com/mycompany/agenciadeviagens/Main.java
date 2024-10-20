package com.mycompany.agenciadeviagens;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            Transportation transportation = new Transportation("Air", 500.00); // 500 dollars
            Accommodation accommodation = new Accommodation("5-star hotel", 100.00); // 100 dollars per day
            
            System.out.println("Enter the travel destination:");
            String destination = sc.nextLine();
            
            System.out.println("Enter the number of days:");
            int numberOfDays = sc.nextInt();
            
            TravelPackage travelPackage = new TravelPackage(transportation, accommodation, destination, numberOfDays);
            
            System.out.println("Enter the profit margin (in %):");
            double profitMargin = sc.nextDouble();
            
            System.out.println("Enter the value of additional fees:");
            double additionalFees = sc.nextDouble();
            
            travelPackage.calculateTotalPackage(profitMargin, additionalFees);
            
            sc.nextLine(); // Consume the remaining newline
            System.out.println("Enter the client's name:");
            String clientName = sc.nextLine();
            
            System.out.println("Enter the payment method:");
            String paymentMethod = sc.nextLine();
            
            Sale sale = new Sale(clientName, paymentMethod, travelPackage);
            
            System.out.println("Enter the dollar exchange rate (e.g., 5.25):");
            double dollarExchangeRate = sc.nextDouble();
            
            sale.displaySale(dollarExchangeRate);
        } // 500 dollars
    }
}
