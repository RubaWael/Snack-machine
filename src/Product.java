
public class Product {
	private String name;
	private int count;
	private int price;

	public Product() {}
	public Product(String s, int n, int p) {
		this.name = s;
		this.count = n;
		this.price = p;
	}

	public int getCount() {
		return this.count;
	}
	public void setCount(int n) {
		this.count = n;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int n) {
		this.price = n;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
}
