/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.ajinc.loancalculator;

/**
 *
 * @author ec2-user
 */
public class LoanType {

    private String type;
    private double interestRate;
    
    public LoanType (String type, double interestRate){
        this.type = type;
        this.interestRate = interestRate;
        
    }
    
    public String getType(){
        return type;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
}
