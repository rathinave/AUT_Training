package flipcart;

public class Product {
	int Product_ID;
	String Product_Name;
	int Price;
	String Brand;
	int Quantity;
	public Product(int product_ID, String product_Name, int price, String brand,int quantity) {
		super();
		Product_ID = product_ID;
		Product_Name = product_Name;
		Price = price;
		Brand = brand;
		Quantity = quantity;
	}
	public Product() {}
}
