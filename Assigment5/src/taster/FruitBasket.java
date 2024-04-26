package taster;

import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basket size you want");
		int n = sc.nextInt();

		Fruit[] Basket = new Fruit[n];

		int count = 0;
		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits");
			System.out.println("5. Display fresh fruits (name, color, weight, taste)");
			System.out.println("6. Mark a fruit as stale (enter index)");
			System.out.println("7. Display tastes of all stale fruits");
			System.out.println("8. Mark all sour fruits stale (optional)");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (count<n) {
					
					Basket[count++] = new Mango();
					Basket[--count].accept();
				} else if (n==0) {
					System.out.println("your basket size is 0");
					
				}else {
					System.out.println("you cantanto add basket size is full");
					
				} 
count++;
break;

			case 2:
				if (count<n) {
					Basket[count] = new Orange();
					Basket[count].accept();
				} else if (n==0) {
					System.out.println("your basket size is 0");
					
				}else {
					System.out.println("you cantanto add basket size is full");
					
				} 
				count++;

				break;
			case 3:
				if (count<n) {
					Basket[count++] = new Apple();
					Basket[--count].accept();
				} else if (n==0) {
					System.out.println("your basket size is 0");
					
				}else {
					System.out.println("you cantanto add basket size is full");
					
				} 
				count++;
				

				break;

			case 4:
				if (count>0) {
					for (Fruit fruit : Basket) {
						System.out.println(fruit.getName());
					}
					

				}
				else {
					System.out.println("your basket is empty");
				}
				
				break;

			case 5:
				if (count>0) {
					for (Fruit ele : Basket) {
						if (ele.isIsfresh()==true) {
						System.out.println(ele.toString());
						System.out.println("taste :"+ele.test());
							
						}
						
					}
					
				}else {
					System.out.println("yor basket is emplty");
				}
				


				break;

			case 6:
				System.out.println("enter the index of fruit yoy want to makek as steal");
				int staeindex = sc.nextInt();
				if (staeindex < count) {
					Basket[staeindex].setIsfresh(false);
					System.out.println(staeindex + "stalendex is set");
					
				}else {
					System.out.println("index is not in range");
				}

				break;

			case 7:
				System.out.println("fruints which are not fresh");
                     for (Fruit ele : Basket) {
                    	 if(ele.isIsfresh() == false) {
                    		 System.out.println("name of fruit "+ele.getName() + "test" +ele.test());
                    	 }
                     }
                     case 8:
                    	 
                    	 for (Fruit eleFruit : Basket) {
                    		 if (eleFruit.test().equals("sour")) {
                    			 eleFruit.setIsfresh(false);
								
							}
                    	 }
                    	 System.out.println("All fruits are steasl");
                    	
				break;

			default:
				System.out.println("invalid choise");
				break;
			}

		} while (choice != 0);

	}

}
