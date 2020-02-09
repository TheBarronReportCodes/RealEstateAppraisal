package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * Test of Real Estate 2 and 3 parameter constructors when a structure is added
 * 
 * @author Jordan Barron
 * @version February 8th, 2020
 *
 */
public class RealEstateWhenAddStructure {
	
	/**
	 * Test RealEstate Constructor 3 parameters show
	 * "NY"
	 * "2"
	 * "2" total structure area
	 * Boundary value test
	 */
	@Test
	public void test3ParameterConstructorNewRealEstateNYLocation2LandArea1StructureAreaWhenAddStructureShouldHaveNYLocation2LandArea2StructureArea() {
		RealEstate realEstate1 = new RealEstate("NY", 2, 1);
		realEstate1.addStructureArea(1);	
		assertEquals("The location is NY the square feet of the land is 2 and the "
				+ "square feet of the structure is 2", realEstate1.toString()); 
	}

	/**
	 * Test RealEstate Constructor 3 parameters show
	 * "NY"
	 * "2000"
	 * "2000" total structure area
	 * Boundary value test
	 */
	@Test
	public void test3ParameterConstructorNewRealEstateNYLocation2000LandArea0StructureAreaWhenAddStructureShouldHaveNYLocation2000LandArea2000StructureArea() {
		RealEstate realEstate1 = new RealEstate("NY", 2000, 0);
		realEstate1.addStructureArea(1000);
		realEstate1.addStructureArea(1000);	
		assertEquals("The location is NY the square feet of the land is 2000 and the "
				+ "square feet of the structure is 2000", realEstate1.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters show
	 * "NY"
	 * "3210"
	 * "1234" total structure area
	 * Sunny Day value test
	 */
	@Test
	public void test3ParameterConstructorNewRealEstateNYLocation3210LandArea500StructureAreaWhenAddStructureShouldHaveNYLocation3210LandArea1234StructureArea() {
		RealEstate realEstate1 = new RealEstate("NY", 3210, 500);
		realEstate1.addStructureArea(500);
		realEstate1.addStructureArea(234);	
		assertEquals("The location is NY the square feet of the land is 3210 and the "
				+ "square feet of the structure is 1234", realEstate1.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters show
	 * "Minneapolis"
	 * "1"
	 * "1" total structure area
	 * Boundary value test
	 */
	@Test
	public void test2ParameterConstructorNewRealEstateMinneapolisLocation1LandArea0StructureAreaWhenAddStructureShouldHaveMinneapolisLocation1LandArea1StructureArea() {
		RealEstate realEstate1 = new RealEstate("Minneapolis", 1);
		realEstate1.addStructureArea(1);	
		assertEquals("The location is Minneapolis the square feet of the land is 1 and the "
				+ "square feet of the structure is 1", realEstate1.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters show
	 * "Minneapolis"
	 * "4000"
	 * "4000"
	 * Boundary value test
	 */
	@Test
	public void test2ParameterConstructorNewRealEstateMinneapolisLocation4000LandArea0StructureAreaWhenAddStructureShouldHaveMinneapolisLocation4000LandArea4000StructureArea() {
		RealEstate realEstate1 = new RealEstate("Minneapolis", 4000);
		realEstate1.addStructureArea(2000);
		realEstate1.addStructureArea(2000);	
		assertEquals("The location is Minneapolis the square feet of the land is 4000 and the "
				+ "square feet of the structure is 4000", realEstate1.toString()); 
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters show
	 * "Minneapolis"
	 * "5210"
	 * "500"
	 * Sunny Day value test
	 */
	@Test
	public void test2ParameterConstructorNewRealEstateMinneapolisLocation5210LandArea0StructureAreaWhenAddStructureShouldHaveMinneapolisLocation5210LandArea500StructureArea() {
		RealEstate realEstate1 = new RealEstate("Minneapolis", 5210);
		realEstate1.addStructureArea(500);
	
		assertEquals("The location is Minneapolis the square feet of the land is 5210 and the "
				+ "square feet of the structure is 500", realEstate1.toString()); 
	}

}
