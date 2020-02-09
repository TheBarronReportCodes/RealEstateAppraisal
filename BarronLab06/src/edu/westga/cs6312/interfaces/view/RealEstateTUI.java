package edu.westga.cs6312.interfaces.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * user interface class for application
 * @author Jordan Barron
 * @version February 8th, 2020
 *
 */
public class RealEstateTUI {
	private Scanner scan;
	private ArrayList<RealEstate> theRealEstates;
	
	/**
	 * 0 parameter constructor that Initializes the instance variables
	 */
	public RealEstateTUI() {
		this.scan = new Scanner(System.in);
		this.theRealEstates = new ArrayList<RealEstate>();
	}
	
	/**
	 * runs different tasks of the application
	 */
	public void run() {
		System.out.println("Welcome to the Real Estate Application \n");
		int userOptionInt;
		
		do {
			this.displayMenu();
			System.out.print("Enter your choice: ");
			String userOptionString = this.scan.nextLine();
			userOptionInt = Integer.parseInt(userOptionString);
			switch (userOptionInt) {
				case 1:
					this.addRealEstate();
					break;
				case 2:
					this.displayRealEstateList();
					break;
				case 3:
					this.quit();
					break;
				default:
					System.out.println("That's not a valid choice. Please try again \n");
					break;
			}
		} while (userOptionInt != 3);
	}
	
	/**
	 * Displays the different options for the user to choose and interact with
	 * 
	 */
	private void displayMenu() {
		System.out.println("1 - Add a piece of real estate to the list");
		System.out.println("2 - Display the real estate in the list");
		System.out.println("3 - Quit");
	}
	
	/**
	 * adds a real estate object to the ArrayList
	 */
	private void addRealEstate() {
		System.out.print("Please enter the location for the real estate \t");
		String userInputLocation = this.scan.nextLine();
		
		System.out.print("Please enter the land square feet of the real estate \t");
		String userInputLandAreaString = this.scan.nextLine();
		int userInputLandAreaInt = Integer.parseInt(userInputLandAreaString);
		
		System.out.print("Please enter the structure area of the real estate \t");
		String userInputStructureAreaString = this.scan.nextLine();
		int userInputStructureAreaInt = Integer.parseInt(userInputStructureAreaString);
		
		RealEstate realEstateObject = new RealEstate(userInputLocation, userInputLandAreaInt, userInputStructureAreaInt);
		
		this.theRealEstates.add(realEstateObject);
		System.out.println();
	}
	
	/**
	 * Displays the RealEstates toString in the list with the addition of the estimate
	 * @precondition: the list cannot be empty. If the list is empty, the notify that there are no real estates in the list
	 */
	private void displayRealEstateList() {
		System.out.println();
		
		String result = "";
		
		if (this.theRealEstates.isEmpty()) {
			System.out.println("No real estates in list \n");
			return;
		}
		
		Collections.sort(this.theRealEstates);
		
		for (RealEstate element : this.theRealEstates) {
			result += String.format(element.toString() + "\nThis real estate is appraised at: $%.2f \n", element.getEstimate());
		}
		
		System.out.println(result);
		System.out.println();
	}
	
	/**
	 * Displays a message wishing the user goodbye
	 */
	private void quit() {
		System.out.println("Thank you for using the Real Estate application. Goodbye! \n");
	}
}
