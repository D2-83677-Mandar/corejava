package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[2];
		
		
		int count =  0;
		int choice ;
		
		
		
		do {
		
			System.out.println("1.Add Student ");
			System.out.println("2.display all students sorted on rollno ");
			System.out.println("3.display all students sorted on name ");
			System.out.println("4.display all students sorted on marks in desc order ");
			System.out.println("5.display all students sorted on course ");
			System.out.println("Enter the choice :");
			choice= sc.nextInt();
			
			switch (choice) {
			
			case 0 :
				
			case 1:
				if(count < 2) {
					arr[count] = new Student();
					arr[count].accept();
					
				}
				count++;
				
				break;
			case 2:
				Arrays.sort(arr);
				for (Student student : arr) {
					System.out.println(student);
					
				}
				break;
				
				
			case 3:
				StudentNameCamparator nameCamparator = new StudentNameCamparator();
				Arrays.sort(arr , nameCamparator);
				for (Student student : arr) {
					System.out.println(student);
				}
					break;
				
					
			case 4: 
				studentMarksCmparator namCmparator = new studentMarksCmparator();
				Arrays.sort(arr,namCmparator);
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
				
			case 5: 
				studentCourseComparator namcCmparator = new studentCourseComparator();
				Arrays.sort(arr,namcCmparator);
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
			default:
				
				System.out.println("Thank You....!!!!!!!");
				break;
			}
			
			
		} while (choice !=0);
		
		
		
		// TODO Auto-generated method stub

	}

}
