package edu.westga.cs6312.interfaces.controller;

import edu.westga.cs6312.interfaces.view.RealEstateTUI;

/**
 * Executes the user interface for the application
 * 
 * @author Jordan Barron
 * @version February 8th, 2020
 *
 */
public class RealEstateDriver {

	/**
	 * Entry point into application
	 * 
	 * @param args
	 * 
	 * not used
	 */
	public static void main(String[] args) {
		RealEstateTUI realEstateObject = new RealEstateTUI();
		realEstateObject.run();

	}

}
