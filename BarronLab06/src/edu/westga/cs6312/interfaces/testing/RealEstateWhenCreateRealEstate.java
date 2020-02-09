package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * Test of Real Estate 2 and 3 parameter constructors
 * @author Jordan Barron
 * @version February 8th, 2020
 */
public class RealEstateWhenCreateRealEstate {

	/**
	 * Test RealEstate Constructor 3 parameters show
	 * "LA"
	 * "1"
	 * "0"
	 * Boundary value test
	 */
	@Test
	public void test3ParameterConstructorShouldHaveLALocation1LandArea0StructureArea() {
		RealEstate realEstate1 = new RealEstate("LA", 1, 0);
		assertEquals("The location is LA the square feet of the land is 1 and the "
				+ "square feet of the structure is 0", realEstate1.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters show
	 * "LA"
	 * "10"
	 * "5"	 
	 * Sunny day test
	 */
	@Test
	public void test3ParameterConstructorShouldHaveLALocation10LandArea5StructureArea() {
		RealEstate realEstate2 = new RealEstate("LA", 10, 5);
		assertEquals("The location is LA the square feet of the land is 10 and the "
				+ "square feet of the structure is 5", realEstate2.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters show
	 * "LA"
	 * "5102"
	 * "4168"
	 * More realistic Sunny day test
	 */
	@Test
	public void test3ParameterConstructorShouldHaveLALocation5102LandArea4168StructureArea() {
		RealEstate realEstate3 = new RealEstate("LA", 5102, 4168);
		assertEquals("The location is LA the square feet of the land is 5102 and the "
				+ "square feet of the structure is 4168", realEstate3.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters show
	 * "Houston"
	 * "1"
	 * "0" default
	 * Boundary value test
	 */
	@Test
	public void test2ParameterConstructorShouldHaveHoustonLocation1LandArea0StructureArea() {
		RealEstate realEstate4 = new RealEstate("Houston", 1);
		assertEquals("The location is Houston the square feet of the land is 1 and the "
				+ "square feet of the structure is 0", realEstate4.toString());  
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters show
	 * "Houston"
	 * "10"
	 * "0" default
	 * Sunny Day test
	 */
	@Test
	public void test2ParameterConstructorShouldHaveHoustonLocation10LandArea0StructureArea() {
		RealEstate realEstate5 = new RealEstate("Houston", 10);
		assertEquals("The location is Houston the square feet of the land is 10 and the "
				+ "square feet of the structure is 0", realEstate5.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters show
	 * "Houston"
	 * "6317"
	 * "0" default
	 * More Realistic Sunny Day test
	 */
	@Test
	public void test2ParameterConstructorShouldHaveHoustonLocation6317LandArea0StructureArea() {
		RealEstate realEstate6 = new RealEstate("Houston", 6317);
		assertEquals("The location is Houston the square feet of the land is 6317 and the "
				+ "square feet of the structure is 0", realEstate6.toString()); 
	}
}
