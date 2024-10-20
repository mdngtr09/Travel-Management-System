package com.mycompany.agenciadeviagens;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public class TravelPackage {
    private final Transportation transportation;
    private final Accommodation accommodation;
    private final String destination;
    private final int numberOfDays;

    public TravelPackage(Transportation transportation, Accommodation accommodation, String destination, int numberOfDays) {
        this.transportation = transportation;
        this.accommodation = accommodation;
        this.destination = destination;
        this.numberOfDays = numberOfDays;
    }

    public double calculateTotalPackage(double profitMargin, double additionalFees) {
        // Calculate the total accommodation cost based on the number of days
        double totalAccommodation = accommodation.getValue() * numberOfDays;
        
        // Calculate the total package cost
        double totalPackage = transportation.getValue() + totalAccommodation;
        
        // Apply the profit margin (percentage)
        totalPackage += totalPackage * (profitMargin / 100);
        
        // Add additional fees
        totalPackage += additionalFees;
        
        return totalPackage;
    }

    public String getDestination() {
        return destination;
    }

    // Helper method to return the total value of the package (in dollars)
    public double getTotalPackageValue() {
        return calculateTotalPackage(0, 0); // To calculate without profit margin and fees
    }
}
