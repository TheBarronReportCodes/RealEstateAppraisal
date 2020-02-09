package edu.westga.cs6312.interfaces.model;

/**
 * Class used to model a piece of real estate.
 * 
 * @author Jordan Barron
 * @version February 8th, 2020
 */
public class RealEstate implements Appraisal, Comparable<RealEstate> {
	private String location;
	private int landArea;
	private int structureArea;
	
	/**
	 * Creates a Real estate property with a location, area measurement for the land, and area measurement for the structure
	 * 3 parameter constructor
	 * @param location The location the property resides
	 * @param landArea The square feet the land takes up
	 * @param structureArea The square feet the structure takes up
	 * @precondition location != null, landArea cannot be <= 0, structureArea cannot be < 0, structureArea cannot be > landArea
	 */
	public RealEstate(String location, int landArea, int structureArea) {
		if (location == null) {
			throw new IllegalArgumentException("Invalid location");
		}
		if (landArea <= 0) {		
			throw new IllegalArgumentException("Invalid land area");
		}	
		if (structureArea < 0) {
			throw new IllegalArgumentException("Invalid structure area");	
		}
		if (structureArea > landArea) {
			throw new IllegalArgumentException("structure area exceeds land area");
		}
		this.location = location;
		this.landArea = landArea;
		this.structureArea = structureArea;
	}
	
	/**
	 * Creates a Real estate property with a location, area measurement for the land, but no structure
	 * 2 parameter constructor
	 * @param location The location the property resides
	 * @param landArea The square feet the land takes up
	 */
	public RealEstate(String location, int landArea) {
		this(location, landArea, 0);
	}
	
	/**
	 * Returns The total area the created structure takes up
	 * @return the structureArea The total area the created structure takes up
	 */
	public int getStructureArea() {
		return this.structureArea;
	}
	
	/**
	 * builds a structure on a piece of land. This structure is added on
	 * @param structureArea The area the created structure will take up
	 * @precondition if new structureArea > landArea, the area cannot be built; structureArea cannot be <= 0
	 */
	public void addStructureArea(int structureArea) {
		if (structureArea <= 0) {
			throw new IllegalArgumentException("cannot add a negative structure area");
		}
		if (this.structureArea + structureArea > this.landArea) {
			throw new IllegalArgumentException("structure area exceeds land area");
		}
		this.structureArea += structureArea;
	}

	/**
	 * String representation of the RealEstate's location, landArea, and structureArea 
	 */
	@Override
	public String toString() {
		String newString = "";
		newString += "The location is " + this.location + " the square feet of the land is " 
						+ this.landArea + " and the square feet of the structure is " + this.structureArea;
		return newString;
	}

	/**
	 * Estimated value of piece of property
	 * @return Returns the estimate in double form
	 */
	@Override
	public double getEstimate() {
		Double landEstimate = this.landArea * 10.0;
		Double structureEstimate = this.structureArea * 100.0;
		Double totalEstimate = landEstimate + structureEstimate;
		return totalEstimate;
	}

	/**
	 * Compares Real Estate Objects to each other based on estimate value
	 * Defines basis on which the Collections.sort method will sort
	 * @return Returns an int that determines if the estimate of the object is sorted or not
	 */
	@Override
	public int compareTo(RealEstate object2) {
		if (this.getEstimate() > object2.getEstimate()) {
			return 1;
		}
		if (this.getEstimate() < object2.getEstimate()) {
			return -1;
		}
		return 0;
	}
	
}






