package com.app.fruits;

public class Mango extends Fruit {
	
	public Mango () {
		
	}

	public Mango(String color, double weight, String name, boolean isfresh) {
		super(color, weight, name, isfresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "sweet and sour";
	}
	
	

}
