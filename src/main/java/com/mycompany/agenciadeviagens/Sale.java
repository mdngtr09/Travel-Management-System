package com.mycompany.agenciadeviagens;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public class Sale {
    private final String clientName;
    private final String paymentMethod;
    private final TravelPackage travelPackage;

    public Sale(String clientName, String paymentMethod, TravelPackage travelPackage) {
        this.clientName = clientName;
        this.paymentMethod = paymentMethod;
        this.travelPackage = travelPackage;
    }

    public double convertDollarToReal(double dollarValue, double dollarExchangeRate) {
        return dollarValue * dollarExchangeRate;
    }

    public void displaySale(double dollarExchangeRate) {
        double packageValueInDollars = travelPackage.getTotalPackageValue();
        double packageValueInReals = convertDollarToReal(packageValueInDollars, dollarExchangeRate);

        System.out.println("Client name: " + clientName);
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Destination: " + travelPackage.getDestination());
        System.out.println("Total package value in dollars: $" + packageValueInDollars);
        System.out.println("Total package value in reals: R$" + packageValueInReals);
    }
}
