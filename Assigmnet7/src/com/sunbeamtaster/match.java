package com.sunbeamtaster;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import com.sunbeam.Cricketer;
import com.sunbeam.player;

public class match {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		player[] team = new player[1]; // Array to store 11 cricketers
		int choice, count = 0;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Add Player");
			System.out.println("2. Display Team Statistics");
			System.out.println("3. Display All Cricketers");
			System.out.println("4. Exit");
			System.out.print("Enter your choice (1-4): ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (count < 1) {
					team[count] = new Cricketer();
					team[count].accept(sc);
				}
				count++;

				break;
			case 2:
				int totalmatchesplayed = 0;
				int totalruns = 0;
				int totalwickets = 0;
				for (player p : team) {
					totalmatchesplayed += p.getMatchesPlayed();
					Cricketer c = (Cricketer) p;
					totalruns += c.getRuns();
					totalwickets += c.getWickets();
				}
				System.out.println( "total Runs : " + totalruns);
				System.out.println( "total wickets : " + totalwickets);
				System.out.println( "total matches played :"+totalmatchesplayed);
				

				break;
			case 3:
				for (player p : team) {
					if (p != null)
						System.out.println("Name of player : "+p.getName() + "  \n" +"matches palyed : " + p.getMatchesPlayed());
				}
				break;
			case 4:
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		} while (choice != 4); // Loop continues until user chooses Exit
	}

	// TODO Auto-generated method stub

}
