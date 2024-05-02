
public class Product implements Comparable<Product> {
	
	private int id;
	String Name ;
	String Category;
	double price;
	
	
	
	public Product(int id, String name, String category, double price) {
		super();
		this.id = id;
		Name = name;
		Category = category;
		this.price = price;
	}
	
	public Product() {
		
	}
	
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
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", Category=" + Category + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.Category.compareTo(o.Category);
	}


}
