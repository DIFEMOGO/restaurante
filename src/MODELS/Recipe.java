package MODELS;

public class Recipe { ///Receta
	private String name;
	private double price; 
	
	
	///constructor
	public Recipe(String name, double price){
		this.name = name;
		this.price = price;		
		}

	///Methods (metodos) /setters/getters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

		
}
