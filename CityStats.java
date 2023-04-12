import java.util.*;
public class CityStats {
	public String city; 
	public String state; 
	
	public double groceries; 
	public double housing; 
	public double utilities; 
	public double transportation;
	public double healthcare; 
	public double miscellaneous; 
	
	
	public CityStats() {
		
	}
	
	public CityStats(String cities, String state, double groceries, double housing, double utilities, double transportation,
			double healthcare, double miscellaneous) {
		
		this.city = cities;
		this.state = state;
		this.groceries = groceries;
		this.housing = housing;
		this.utilities = utilities;
		this.transportation = transportation;
		this.healthcare = healthcare;
		this.miscellaneous = miscellaneous;
	}
	
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public double getGroceries() {
		return groceries;
	}

	public double getHousing() {
		return housing;
	}

	public double getUtilities() {
		return utilities;
	}

	public double getTransportation() {
		return transportation;
	}

	public double getHealthcare() {
		return healthcare;
	}

	public double getMiscellaneous() {
		return miscellaneous;
	}

	public double getCOLI() {
		double COLI  = 0.13 * groceries + 0.29 * housing + 0.10 * utilities + 0.12 * transportation + 
				0.04 * healthcare + 0.32 * miscellaneous;
		return COLI;
	}
	
}
