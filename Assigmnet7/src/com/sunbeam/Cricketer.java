package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Cricketer extends player implements Batter,Bolwer {
	
	
	 private int Runs = 0 ;
	 private int wickets = 0;
	  

	

	

	public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets) {
		super(id, name, age, matchesPlayed);
		Runs = runs;
		this.wickets = wickets;
	}
	public Cricketer() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cricketer other = (Cricketer) obj;
		return Runs == other.Runs && wickets == other.wickets;
	}

	public void setRuns(int runs) {
		Runs = runs;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	

	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		return wickets;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return Runs;
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter the runs :");
		Runs = sc.nextInt();
		System.out.println("Enter the wickets :");
		wickets = sc.nextInt();
		
	}
	@Override
	public String toString() {
		return "Cricketer [Runs=" + Runs + ", wickets=" + wickets + ", toString()=" + super.toString() + "]";
	}



	
	
	
	
	
}
