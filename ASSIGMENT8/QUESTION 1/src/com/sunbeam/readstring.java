package com.sunbeam;

import java.util.Scanner;

public class readstring {
	
	String stringName = null ;
	Scanner  sc = new Scanner(System.in);
	
	
 public	void accept() {
	System.out.println("Enter the string : ");
	stringName = sc.nextLine();
	
	}

	public void cheak() {
		if( stringName.length() < 80 ) {
			throw new Invalidexecption("string is less tha 80");
		}
		else {
			System.out.println( "STRING NAME  IS :"+stringName);
		}
			
	}

	

}
