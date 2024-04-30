package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public abstract class player {
	
	private int id;
	private String Name;
	private int Age;
	private int MatchesPlayed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getMatchesPlayed() {
		return MatchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		MatchesPlayed = matchesPlayed;
	}
	
	@Override
	public String toString() {
		return "player [id=" + id + ", Name=" + Name + ", Age=" + Age + ", MatchesPlayed=" + MatchesPlayed + "]";
	}
	public player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		Name = name;
		Age = age;
		MatchesPlayed = matchesPlayed;
	}
	
	
	public player() {
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		player other = (player) obj;
		return Age == other.Age && MatchesPlayed == other.MatchesPlayed && Name == other.Name && id == other.id;
	}
	
	
	
	public void accept(Scanner sc) {
		System.out.println("Enter the id");
		id = sc.nextInt();
		
		System.out.println("Enter the Name");
	 Name = sc.next();
		
		System.out.println("Enter the age");
		Age = sc.nextInt();
		
		System.out.println("Enter the matchesplayed");
		MatchesPlayed = sc.nextInt();
		
		
		
		
		
	}

}
