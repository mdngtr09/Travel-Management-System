package com.mycompany.agenciadeviagens;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public class Accommodation {
    private final String description;
    private final double dailyRate;  // Price per day

    public Accommodation(String description, double dailyRate) {
        this.description = description;
        this.dailyRate = dailyRate;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return dailyRate;
    }
}
