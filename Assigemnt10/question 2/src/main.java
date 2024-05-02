import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product [] arr = {
				new Product(1,"bloothuth" , "Electronics",1200),
				new Product(3,"speaker" , "Electronics",1000),
				new Product(5,"cake" , "Food",200),
				new Product(7,"bat" , "Sports",100),
				new Product(10,"pen" , "staatrionary",120),
				new Product(2,"Tablet" , "medical",200),
				new Product(4,"gul" , "organicfood",500),
				new Product(6,"cap" , "cloth",60),
				new Product(8,"bag" , "plastic",500),
				new Product(9,"hedhphones" , "Electronics",300)
		};
		
		Arrays.sort(arr);
		
		for (Product product : arr) {
			System.out.println(product);
		}

	}

}
