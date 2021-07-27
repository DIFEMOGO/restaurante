package MODELS;

public class Table {
	
	private String tableNumber; 
	private int capacity;
	private String location; ///Ubicacion
	
	
	///constructor
	public Table(String tableNumber, int capacity, String location){
		this.tableNumber = tableNumber;
		this.capacity = capacity;
		this.location = location;
		
		}


	public String getTableNumber() {
		return tableNumber;
	}


	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

}
