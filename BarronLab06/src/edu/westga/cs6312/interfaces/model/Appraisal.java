package edu.westga.cs6312.interfaces.model;

/**
 * Interface that allows classes that implement it to have an appraisal
 * 
 * @author Jordan Barron
 * @version February 8th, 2020
 *
 */
public interface Appraisal {
	/**
	 * estimated value of a piece of property
	 * @return the value of a piece of property in the form of a double
	 */
	double getEstimate();
}
