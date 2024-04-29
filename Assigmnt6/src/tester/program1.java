package tester;

import java.util.Scanner;

import com.sunbeam.Employee;
import com.sunbeam.commEmployee;
import com.sunbeam.grossSaleEmployee;
import com.sunbeam.hourEmployee;
import com.sunbeam.salariedEmployee;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Employee e = new commEmployee();//upcasting
//		e.accept(sc);
//	System.out.println(e.toString());
		int count = 0;

		System.err.println("enter the size of arrya");
		int n = sc.nextInt();
		Employee[] salary = new Employee[n];

		int choice;
		do {
			System.out.println("*****************************\nMenu:****************************************");
			System.out.println("0. Exit");
			System.out.println("1. wekkliy salride employee");
			System.out.println("2. hourly salaried employee");
			System.out.println("3. commison employee");
			System.out.println("4. base salried commison employee");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (count < n) {
//				
//				Basket[count++] = new Mango();
//				Basket[count].accept();

					Employee e1 = new salariedEmployee();// upcasting
					e1.accept(sc);
					System.out.println(e1.toString());
					System.out.println(e1.payRollCalculation());

				} else if (n == 0) {
					System.out.println("your basket size is 0");

				} else {
					System.out.println("you cantanto add size is full");

				}
				count++;
				break;
			case 2:
				if (count < n) {
//				
//				Basket[count++] = new Mango();
//				Basket[count].accept();

					Employee e1 = new hourEmployee();// upcasting
					e1.accept(sc);
					System.out.println(e1.toString());
					System.out.println(e1.payRollCalculation());

				} else if (n == 0) {
					System.out.println("your basket size is 0");

				} else {
					System.out.println("you cantanto add size is full");

				}
				count++;
				break;
			case 3:
				if (count < n) {
//				
//				Basket[count++] = new Mango();
//				Basket[count].accept();

					Employee e1 = new commEmployee();// upcasting
					e1.accept(sc);
					System.out.println(e1.toString());
					System.out.println(e1.payRollCalculation());

				} else if (n == 0) {
					System.out.println("your basket size is 0");

				} else {
					System.out.println("you cantanto add size is full");

				}
				count++;
				break;
			case 4:
				if (count < n) {
//				
//				Basket[count++] = new Mango();
//				Basket[count].accept();

					commEmployee e1 = new grossSaleEmployee();// upcasting
					e1.accept(sc);
					System.out.println(e1.toString());
					System.out.println(e1.payRollCalculation());

				} else if (n == 0) {
					System.out.println("your basket size is 0");

				} else {
					System.out.println("you cantanto add size is full");

				}
				count++;
				break;
			}

		} while (choice != 0);

	}
}
