package car;

import java.util.Scanner;

public class car {

	double milesDriven = 0;
	double costPerGallon = 0;
	double milesPerGallon = 0;
	double parkingFees = 0;
	double dailyTolls = 0;
	double dailyDrivingCost = 0;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.print("Enter your total miles driven per day: ");
		milesDriven = sc.nextDouble();

		System.out.print("Enter your cost per gallon of gasoline: ");
		costPerGallon = sc.nextDouble();

		System.out.print("Enter your average miles per gallon: ");
		milesPerGallon = sc.nextDouble();

		System.out.print("Enter your parking fees per day: ");
		parkingFees = sc.nextDouble();

		System.out.print("Enter your tolls per day: ");
		dailyTolls = sc.nextDouble();
	}

	public void calculate() {
		dailyDrivingCost = ((milesDriven / milesPerGallon) * costPerGallon) + parkingFees + dailyTolls;
		System.out.print("Driving cost " + dailyDrivingCost);
	}

	public void display() {
		System.out.print(" total miles driven per day: " + milesDriven);

		System.out.print(" cost per gallon of gasoline: " + costPerGallon);

		System.out.print(" average miles per gallon: " + milesPerGallon);

		System.out.print(" parking fees per day: " + parkingFees);

		System.out.print("Enter your tolls per day: " + dailyTolls);

	}
}
