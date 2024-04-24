import java.util.Scanner;

public class Invoice {

	private String partName;
	private String descption;

	private int qunatity;
	private double price;
	  Scanner sc = new Scanner(System.in);

	public Invoice() {

	}

	public Invoice(String partName, String descption, int qunatity, double price) {
		this.partName = partName;
		this.descption = descption;
		this.qunatity = qunatity;
		this.price = price;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getDescption() {
		return descption;
	}

	public void setDescption(String descption) {
		this.descption = descption;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void accept() {
		
	     System.out.println("Enter the partName : " );
	     setPartName(sc.nextLine());
	     System.out.println("Enter the deccrption : " );
	     setDescption(sc.nextLine());
	     
	     System.out.println("Enter the quntity : " );
	     setQunatity(sc.nextInt());
	     
	     System.out.println("Enter the price : " );
	     setPrice(sc.nextDouble());
	     
	 
		
	}
	
	public void display() {
		System.out.println("the part name"  +getPartName());
		System.out.println("the part decrrption"  +getDescption());
		System.out.println("the part price "  +getPrice());
		System.out.println("the part qunatitye"  +getQunatity());
		
		
	}
	
	public void calculate() {
		
		double invoice = getQunatity() * getPrice();
		System.out.println("invoice is :" +invoice);
		
	}

}
