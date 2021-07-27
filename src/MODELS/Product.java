package MODELS;

public class Product {

	///attributes
	
	private int quantity; 
	private String name;
	private String brand; ///marca
	private double price;
	
	///constructor
	public Product(String brand, String name, double price, int quantity){
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		}
		
		///Methods (metodos) /setters/getters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setName (String name) {
		this.name = name;
		}
	public String getName () {
		return name;
		}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setQuantity (int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity () {
		return quantity;
	}
	
	
	
	
	
}

