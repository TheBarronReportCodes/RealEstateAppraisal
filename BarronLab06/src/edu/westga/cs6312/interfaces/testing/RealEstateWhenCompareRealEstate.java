package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * Test of Real Estate 2 and 3 parameter constructors compared to another object based on estimates
 * 
 * @author Jordan Barron
 * @version February 9th, 2020
 *
 */
public class RealEstateWhenCompareRealEstate {

	/**
	 * Test RealEstate Constructor 2 parameters when compareTo show
	 * Orlando: 1 * 10.0 + 0 * 100.0 = 10.0
	 * Miami: 1 * 10.0 + 1 * 100.0 = 110.0
	 * 
	 * Orlando < Miami = -1
	 */ 
	@Test
	public void test2ParameterConstructorFirstNewRealEstateObject10WhenCompareToSecondNewRealEstateObject110ShouldHaveNegativeOne() {
		RealEstate realEstate1 = new RealEstate("Orlando", 1);
		RealEstate realEstate2 = new RealEstate("Miami", 1);
		realEstate2.addStructureArea(1);
		assertEquals(-1, realEstate1.compareTo(realEstate2));
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters when compareTo show
	 * Orlando: 1 * 10.0 + 1 * 100.0 = 110.0
	 * Miami: 1 * 10.0 + 0 * 100.0 = 10.0
	 * 
	 * Orlando > Miami = 1
	 */
	public void test2ParameterConstructorFirstNewRealEstateObject110EstimateWhenCompareToSecondNewRealEstateObject10EstimateShouldHavePositiveOne() {
		RealEstate realEstate1 = new RealEstate("Orlando", 1);
		RealEstate realEstate2 = new RealEstate("Miami", 1);
		realEstate1.addStructureArea(1);
		assertEquals(1, realEstate1.compareTo(realEstate2));
	}
	
	/**
	 * Test RealEstate Constructor 2 parameters when compareTo show
	 * Orlando: 1 * 10.0 + 0 * 100.0 = 10.0
	 * Miami: 1 * 10.0 + 0 * 100.0 = 10.0
	 * 
	 * Orlando == Miami = 0
	 */
	public void test2ParameterConstructorFirstNewRealEstateObject10EstimateWhenCompareToSecondNewRealEstateObject10EstimateShouldHave0() {
		RealEstate realEstate1 = new RealEstate("Orlando", 1);
		RealEstate realEstate2 = new RealEstate("Miami", 1);
		assertEquals(0, realEstate1.compareTo(realEstate2));
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters when compareTo show
	 * Dallas: 13456 * 10.0 + 11583 * 100.0 = 1292860
	 * San Antonio: 13456 * 10.0 + 10000 * 100.0 = 1134560
	 * 
	 * Dallas > San Antonio = 1
	 */
	public void test3ParameterConstructorFirstNewRealEstateObject1292860EstimateWhenCompareToSecondNewRealEstateObject1134560ShouldHavePositiveOne() {
		RealEstate realEstate3 = new RealEstate("Dallas", 13456, 11583);
		RealEstate realEstate4 = new RealEstate("San Antonio", 13456, 10000);
		assertEquals(1, realEstate3.compareTo(realEstate4));
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters when compareTo show
	 * Dallas: 13456 * 10.0 + 11583 * 100.0 = 1292860
	 * San Antonio: 13456 * 10.0  + 12000 * 100.0 = 1334560
	 * 
	 * Dallas < San Antonio = -1
	 */
	public void test3ParameterConstructorFirstNewRealEstateObject1292860EstimateWhenCompareToSecondNewRealEstateObject1334560ShouldHaveNegativeOne() {
		RealEstate realEstate3 = new RealEstate("Dallas", 13456, 11583);
		RealEstate realEstate4 = new RealEstate("San Antonio", 13456, 10000);
		realEstate4.addStructureArea(2000);
		assertEquals(-1, realEstate3.compareTo(realEstate4));
	}
	
	/**
	 * Test RealEstate Constructor 3 parameters when compareTo show
	 * Dallas: 13456 * 10.0 + 11583 * 100.0 = 1292860
	 * San Antonio: 13456 * 10.0 + 11583 * 100.0 = 1292860
	 * 
	 * Dallas == San Antonio = 0
	 */
	public void test3ParameterConstructorFirstNewRealEstateObject1292860EstimateWhenCompareToSecondNewRealEstateObject1292860ShouldHave0() {
		RealEstate realEstate3 = new RealEstate("Dallas", 13456, 11583);
		RealEstate realEstate4 = new RealEstate("San Antonio", 13456, 11583);
		assertEquals(0, realEstate3.compareTo(realEstate4));
	}

}
