package assigemnt1;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	boolean askchoise = true;
		int choise = 0;

		double bill = 0;
		int qty = 0;
		System.out.println("***********************KOLHAPURI TADAKA *************************");
		System.out.println("*******menu*********");
		System.out.println(
				"1.Dosa=10  2.Idli=20 \n3.samosa= 15  4.tea=10 \n5.phoha=20  6.upma=15 \n7.shira=15  8.uttapa= 50\n9.partha = 50\n10.genrate a bill");
		System.out.println("*********************");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("choise what do you want =");
			choise = sc.nextInt();
			System.out.println("enter qunatity what do you want =");
			if (choise != 10) {
				qty = sc.nextInt();
			}

			switch (choise) {
			case 1:
				bill += (qty * 10);

				break;
			case 2:
				bill += (qty * 20);

				break;
			case 3:
				bill += (qty * 15);

				break;
			case 4:
				bill += (qty * 10);

				break;
			case 5:
				bill += (qty * 20);

				break;
			case 6:
				bill += (qty * 15);

				break;
			case 7:
				bill += (qty * 15);

				break;
			case 8:
				bill += (qty * 50);

				break;
			case 9:
				bill += (qty * 50);

				break;
			case 10:
				//askchoise = false;
				System.out.println("your BIL is :" + bill);
				System.out.println("Thank you visit Again !!!!!!!!");

				break;

			default:
				System.out.println("enter the valid No ");
				break;
			}

		} while (choise != 10);

	}
}
