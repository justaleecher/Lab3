
/*  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
 
import java.util.Scanner;

public class Main extends Currency{
	
	// Reference 1 Pound Object, Reference 2 Dollar Object
	Dollar dollar = new Dollar();
	Pound pound = new Pound();
	// Array of Two Currency References
	Currency[] currencyObjects = {dollar,pound};
	// Boolean to help with do while loop
    boolean isOn = true;
    // double for our error handling
    double value = 0.00;
	// Our main method
	public static void main(String[] args) {
		Main max = new Main();
	}
	
	// User Interaction called for main 
	public Main() {
		userInteraction();
	}
	
	// Method for User Interface
	public void userInteraction() {
		System.out.println("Welcome to Currency Simulator:");
		System.out.println("Enter a or s to add or subtract d or p to dollar or pound the value you would like to deposite, the name of the currency");
		System.out.println("Example: a d 2.00 dollar -> add 2.00 dollars to dollar balance");
		dollar.print();
		pound.print();
		// do while loop that checks if isOn = false
		do{
		Scanner sc = new Scanner(System.in);
		String ops = sc.next();
		String type = sc.next();
		try {
	    value = sc.nextDouble();
		}catch(Exception typeMismatch) {
			System.out.println("Only numbers with decimals can go in for value");
		}
		String typecheck = sc.next();
	   
	    // checks for input
		if (ops.equals("a")) {
			if (type.equals("d") && typecheck.equals("dollar")) {
				Dollar temp = new Dollar(value);
				currencyObjects[0] = dollar.add((Dollar)currencyObjects[0], temp); 
				((Dollar)currencyObjects[0]).print(); 
				((Pound)currencyObjects[1]).print();
				System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
			}
			
			else if (type.equals("p") && typecheck.equals("pound")) {
				Pound temp = new Pound(value); 
				currencyObjects[1] = pound.add((Pound) currencyObjects[1], temp); //
				((Dollar)currencyObjects[0]).print();
				((Pound)currencyObjects[1]).print();
				System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
			}
			else {
				System.out.println("Incorrect operation!");
			}
		}
		
		// checks for input
		if (ops.equals("s")) {
			if (type.equals("d") && typecheck.equals("dollar")) {
				Dollar temp = new Dollar(value);
				currencyObjects[0] = dollar.subtract((Dollar)currencyObjects[0], temp);
				((Dollar)currencyObjects[0]).print();
				((Pound)currencyObjects[1]).print();
				System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
			}
			else if (type.equals("p") && typecheck.equals("pound")) {
				Pound temp = new Pound(value);
				currencyObjects[1] = pound.subtract((Pound) currencyObjects[1], temp);
				((Dollar)currencyObjects[0]).print();
				((Pound)currencyObjects[1]).print();
				System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
					
			}
			else {
				System.out.println("Incorrect operation!");
			}
		}
		
		if (ops.equals("q")) {
			isOn = false;
		}
		
		}while(isOn == true);
			return;
 }
}

// Types of exceptions we need
// Array Out of Bounds
// Arethmetic
// Type protection 
// ArrayStoreException
// Maybe Instantiation Exception
// Invalid cast

