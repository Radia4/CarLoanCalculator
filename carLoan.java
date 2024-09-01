/**
 * 
 */
package CarLoanPayment;

import java.util.Scanner;

/**
 * This program calculates the monthly car loan payment based on user input
 * By: Radia Haashmi
 */
public class carLoan {

	public static void main(String[] args) {
		 // Create a scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to input the price of the car
		System.out.print("What is the car price? " );
		Double carPrice = scanner.nextDouble();
		
		// Prompt the user to input the amount they want to pay as a down payment
		System.out.print("How much down payment would you like to put? ");
		Double downPayment = scanner.nextDouble();
		// Calculate the loan principal by subtracting the down payment from the car price
		Double loanPrincipal = carPrice - downPayment;
		
		// Prompt the user to input the annual interest rate
		System.out.print("Annual Interest Rate: ");
		Double annualInterestRate = scanner.nextDouble();
		// Convert the annual interest rate to a monthly interest rate
		Double monthlyInterestRate = annualInterestRate / 100 / 12;
		
		// Prompt the user to input the loan period in years
		System.out.print("loan period (Years) ");
		int Period = scanner.nextInt();
		// Convert the loan period in years to the number of monthly payments
		int numberOfPayements = Period * 12;
		
		// Calculate the monthly car payment using the formula for a fixed-rate loan
		Double totalCarPayment = loanPrincipal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayements)) 
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayements) - 1 );
		
		// Output the calculated monthly car payment, formatted to two decimal places
		System.out.print("Your monthly car payment is $" + String.format("%.2f", totalCarPayment));

	}

}
