package Maven.Newyear;

public class Gifts extends Chocolates {
	public int quantity;

	
	
	public Gifts() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Gifts(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}



	public Gifts(String name, double price, int quantity) {
		super(name, price);
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Gifts [name = " + this.name + ", price = " + price + " quantity=" + quantity + "]";
	}
	
	
	
}