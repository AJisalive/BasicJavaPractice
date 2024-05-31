package com.ajinc.loancalculator;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;




public class LoanCalculator {

    public float calculateLoan(double borrowAmount, double interestRate){
        double totalPayment = borrowAmount + (borrowAmount * interestRate);
        return (float) totalPayment;
    }

    public static void main(String[] args) {
        
        Map<Integer, LoanType> loanTypes = new HashMap<>();
        loanTypes.put(1, new LoanType("House", 0.05));
        loanTypes.put(2, new LoanType("New Car", 0.07));
        loanTypes.put(3, new LoanType("Used Car", 0.12));
        
        System.out.println("""
                
                Welcome to the Loan Calculator!
                
                Tell us how much you want to borrow and we'll tell you how much it'll cost!
                """);

        Scanner scanner = new Scanner(System.in);
        
        boolean validChoice = false;
        
        while (!validChoice){
                System.out.println("""
                What would you like to receive a loan for? Please input the number from the following options:
                
                1. House
                2. New Car
                3. Used Car
                \n""");
        
        try {
            int loanChoice = scanner.nextInt();
            
            if (loanTypes.containsKey(loanChoice)){
                LoanType selectedLoan = loanTypes.get(loanChoice);
                System.out.println("You have chosen: "+selectedLoan.getType());
                
                System.out.print("Enter the amount you want to borrow: £");
                double borrowAmount = scanner.nextDouble();
                
                LoanCalculator calculator = new LoanCalculator();
                float totalPayment = calculator.calculateLoan(borrowAmount, selectedLoan.getInterestRate());
                
                System.out.printf("The total payment amount for a %s loan of £%.2f is £%.2f%n", 
                        selectedLoan.getType(), borrowAmount, totalPayment);
                
                System.out.println("How many years would you like to pay this over? Chose between 1 and 5 years: ");
                int yearsToPay = scanner.nextInt();
                
                double yearlyPayment = (totalPayment/yearsToPay);
                double monthlyPayment = (totalPayment/(12*yearsToPay));
                
                System.out.printf("""
                                  You have Chosen to pay over %o years.
                                  That will cost you £%.2f per year.
                                  This will be £%.2f per month over %d years.
                                  """, yearsToPay, yearlyPayment, monthlyPayment, yearsToPay);
                        
                validChoice = true;
            } else {
                System.out.println("Invalid Choice. Enter a number between 1 and 3: ");
              }
        
                
            
        } catch (Exception e) {
            System.out.println ("Invalid input. Please enter a valid number: ");
            scanner.next(); //clear invalid input
        
          }
            
        }
    }
        
           
        
}    
