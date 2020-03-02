package Maven.Newyear;

public class Chocolates {
	public String name;
	public double price;
	public Chocolates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chocolates(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Chocolates [name=" + name + ", price=" + price + "]";
	}
	
	
}