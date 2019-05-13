/**
 * 
 */
package homework2;

/**
 * @author margaret.parsons
 *
 */
public class Carpool {

	/**
	 * Determine structure and savings from carpooling
	 */
	public static void main(String[] args) {
		// Declare variables
		int cars = 100;
		int drivers = 30;
		int passengers = 90;
		int carsDriven = drivers;
		int carsNotDriven = cars-drivers;
		double spaceInACar = 4.0;
		double carpoolCapacity = carsDriven * spaceInACar;
		double passengersPerCar = passengers/carsDriven;
		double averageMilesPerGallon = 23.6;
		double averageMilesDriven = 29.2;
		double gasCostPerGallon = 2.517;
		double gasCostPerTrip = (averageMilesDriven * gasCostPerGallon) / (averageMilesPerGallon);
		double moneySaved = (gasCostPerTrip * cars) - (gasCostPerTrip * carsDriven);
		
		//Output
		System.out.printf("There are %d cars available.%n", cars);
		System.out.printf("There are only %d drivers available.%n", drivers);
		System.out.printf("That means there will be %d empty cars today!%n", carsNotDriven);
		System.out.printf("We can transport %.0f people today.%n", carpoolCapacity);
		System.out.printf("Out of that, we're transporting %d today.%n", passengers);
		System.out.printf("So we'll need to put about %.0f in each car.%n", passengersPerCar);
		System.out.printf("Long story short, today, we'll be saving about $%.2f!", moneySaved);
	}

}
