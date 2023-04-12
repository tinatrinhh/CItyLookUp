import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;



public class CityLookup {
	// Initialize totalCount and set it to 0
	private int totalCount = 0;
	private final ArrayList<CityStats> cityStats;
	
	
	/**
	 * Constructor a CityLookup object with data from specified file 
	 * 
	 * @param filename is the name of the file contains city stats data
	 */
	
	
    public CityLookup(String filename) {
    	this.totalCount = 0;
        this.cityStats = new ArrayList<>();
        // Create custom method when file is not existed 
        try {
            Scanner infile = new Scanner(new File(filename));

            while (infile.hasNextLine()) {
            	double groceries = Double.parseDouble(infile.next());
                double housing = Double.parseDouble(infile.next());
                double utilities = Double.parseDouble(infile.next());
                double transportation = Double.parseDouble(infile.next());
                double healthcare = Double.parseDouble(infile.next());
                double miscellaneous = Double.parseDouble(infile.next());
                String state = infile.next();
                String city = infile.nextLine().trim();
                CityStats sight = new CityStats(city, state, groceries, housing, utilities, transportation, healthcare,
                        miscellaneous);
                this.cityStats.add(sight);
                totalCount++;
            }
            infile.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("No such file: " + filename);
        }
    }
	// Create numCities method
    public int numCities() {
    	return totalCount;
    }
 
    // Create showByState method
    public void showByState(String state) {
        List<CityStats> cities = new ArrayList<>();

        for (CityStats stat : cityStats) {
            if (stat.getState().equalsIgnoreCase(state)) {
                cities.add(stat);
            }
        }

        for (CityStats stat : cities) {
            System.out.println(stat.getCity() + ", " + state + ": " + stat.getCOLI());
        }

        System.out.println("Number of cities in " + state + ": " + cities.size());
    }

    public void showByCity(String city) {
        List<CityStats> cities = new ArrayList<>();

        for (CityStats stat : cityStats) {
            if (stat.getCity().contains(city)) {
                cities.add(stat);
            }
        }

        for (CityStats stat : cities) {
            System.out.println(stat.getCity() + ", " + stat.getState() + ": " + stat.getCOLI());
        }

        System.out.println("Number of cities that contain " + city + ": " + cities.size());
    }

    public double lookupCOLI(String city, String state) {
        CityStats foundCityStat = null;

        for (CityStats stat : cityStats) {
            if (stat.getCity().equalsIgnoreCase(city) && stat.getState().equalsIgnoreCase(state)) {
                foundCityStat = stat;
                break;
            }
        }

        return foundCityStat != null ? foundCityStat.getCOLI() : -999.0;
    }

    public double compareCities(double salary, String currentCity, String currentState, String nextCity,
            String nextState) {
        double currentCOLI = lookupCOLI(currentCity, currentState);
        double nextCOLI = lookupCOLI(nextCity, nextState);
        return Math.round((salary * (nextCOLI / currentCOLI)) * 10.0) / 10.0;
    }
}
