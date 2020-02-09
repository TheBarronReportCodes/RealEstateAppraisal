package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * Test of Real Estate 2 and 3 parameter constructors when the estimate is accessed
 * 
 * @author Jordan Barron
 * @version February 8th, 2020
 *
 */
public class RealEstateWhenGetEstimate {

	/**
	 * Test RealEstate Constructor 3 parameters when getEstimate show
	 * 1 * 10.0 +
	 * 1 * 100.0 =
	 * 110.0
	 * Boundary value test
	 */
	@Test
	public void test3ParameterConstructorNewRealEstateATLLocation1LandArea1StructureAreaWhenGetEstimateShouldHave110InDecimal() {
		RealEstate realEstate1 = new RealEstate("ATL", 1, 1);
		assertEquals(110.0, realEstate1.getEstimate());
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters when getEstimate show
	 * 7345 * 10.0 +
	 * 6324 * 100.0 =
	 * 705850.0
	 * Realistic Sunny Day value test
	 */
	@Test
	public void test3ParameterConstructorNewRealEstateATLLocation7345LandArea6324StructureAreaWhenGetEstimateShouldHave705850InDecimal() {
		RealEstate realEstate2 = new RealEstate("ATL", 7345, 6324);
		assertEquals(705850.0, realEstate2.getEstimate());
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters when getEstimate show
	 * 10000 * 10.0 +
	 * 9123 * 100.0 =
	 * 1012300.0
	 * Sunny day value test when addStructureArea method is used
	 */
	@Test
	public void test3ParameterConstructorNewRealEstateATLLocation10000LandArea8123StructureAreaWhenAddStructure9123StructureAreaGetEstimateShouldHave1012300InDecimal() {
		RealEstate realEstate3 = new RealEstate("ATL", 10000, 8123);
		realEstate3.addStructureArea(1000);

		assertEquals(1012300.0, realEstate3.getEstimate());
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters when getEstimate show
	 * 1 * 10.0 +
	 * 0 * 100.0 =
	 * 10.0
	 * Boundary value test
	 */
	@Test
	public void test2ParameterConstructorNewRealEstateSEALocation1LandArea0StructureAreaWhenGetEstimateShouldHave10InDecimal() {
		RealEstate realEstate4 = new RealEstate("SEA", 1);
		assertEquals(10.0, realEstate4.getEstimate());
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters when getEstimate show
	 * 11500 * 10.0 +
	 * 0 * 100.0 =
	 * 115000.0
	 * Realistic Sunny Day value test
	 */
	@Test
	public void test2ParameterConstructorNewRealEstateSEALocation11500LandArea0StructureAreaWhenGetEstimateShouldHave115000InDecimal() {
		RealEstate realEstate5 = new RealEstate("SEA", 11500);
		assertEquals(115000.0, realEstate5.getEstimate());
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters when getEstimate show
	 * 11500 * 10.0 +
	 * 500 * 100.0 =
	 * 165000.0
	 * Sunny day value test when addStructureArea method is used
	 */
	@Test
	public void test2ParameterConstructorNewRealEstateSEALocation11500LandArea0StructureAreaWhenAddStructure500StructureAreaGetEstimateShouldHave165000InDecimal() {
		RealEstate realEstate6 = new RealEstate("SEA", 11500);
		realEstate6.addStructureArea(500);
		assertEquals(165000.0, realEstate6.getEstimate());
	}

}
