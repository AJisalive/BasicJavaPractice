package com.ajinc.weeklybudgetcalculator;
import java.util.Scanner;

public class WeeklyBudgetCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the weedkly budget calculator!\n\n");

        double totalCosts = 0;
        boolean loopChecker = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How much money do you get after tax? --> £");
        double pay = scanner.nextDouble();

        while (loopChecker==true && totalCosts <= pay){

            System.out.print("How much is your rent/mortgage pcm? --> £");
            double rentOrMortgage = scanner.nextDouble();
            totalCosts += rentOrMortgage;
            System.out.println("Money Left: £" + (pay - totalCosts));
            if (totalCosts >= pay) {
                System.out.println("You have no money left. Please adjust costs or look at your life choices.\n\n Exiting....");
                break;
            }

            System.out.print("How much do you pay for bills on average pcm? --> £");
            double bills = scanner.nextDouble();
            totalCosts += bills;
            System.out.println("Money Left: £" + (pay - totalCosts));
            if (totalCosts >= pay) {
                System.out.println("You have no money left. Please adjust costs or look at your life choices.\n\n Exiting....");
                break;
            }

            System.out.print("How much do you pay for food on average pcm? This inclues eating out and grocery shopping. --> £");
            double food = scanner.nextDouble();
            totalCosts += food;
            System.out.println("Money Left: £" + (pay - totalCosts));
            if (totalCosts >= pay) {
                System.out.println("You have no money left. Please adjust costs or look at your life choices.\n\n Exiting....");
                break;
            }

            System.out.print("Add up remaining expenses not covered already --> £");
            double other = scanner.nextDouble();
            totalCosts += other;
            System.out.println("Money Left: £" + (pay - totalCosts));
            if (totalCosts >= pay) {
                System.out.println("You have no money left. Please adjust costs or look at your life choices.\n\n Exiting....");
                break;
            }

            System.out.print("How much do you put into savings pcm? --> £");
            double savings  = scanner.nextDouble();
            totalCosts += savings;
            System.out.println("Money Left: £" + (pay - totalCosts));
            if (totalCosts >= pay) {
                System.out.println("You have no money left. Please adjust costs or look at your life choices.\n\n Exiting....");
                break;
            } 
            else {
                double moneyLeftOver = pay - totalCosts; 
                double budgetPerWeek = (moneyLeftOver/4);
                System.out.printf("Assuming a 4 week month, you have £%.2f to spend each week.\n Exiting....", budgetPerWeek);
                loopChecker=false;

            }

        };

        scanner.close();

    }
}
