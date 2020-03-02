package Maven.Newyear;

public class Sweets {
	public String name;
	public int weight;
	public double price;
	
	public Sweets() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Sweets [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
}
