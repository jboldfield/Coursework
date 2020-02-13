//Cargo ship class extends ship 
public class CargoShip extends Ship{
	//Data fields
	private String name;
	private int year;
	private int tonnage;
			
	//No argument constructor 
	public CargoShip () {
		this("No Name",1776, 10000);
	}
	
	//Overloaded constructor (Accepts name and passengers)
	public CargoShip (String name, int tonnage) {
		this.name = name;
		this.year = 1776;
		this.tonnage = tonnage;
	}
			
	//Overloaded constructor (Accepts name, year, passengers)
	public CargoShip (String name, int year, int tonnage) {
		this.name = name;
		this.year = year;
		this.tonnage = tonnage;
	}
			
	//Accessors and mutators for name, year, and tonnage
	public void setName (String name) {
		this.name = name;
	}
			
	public String getName () {
		return this.name;
	}
			
	public void setYear (int year) {
		this.year = year;
	}
			
	public int getYear () {
		return this.year;
	}
			
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
			
	public int getTonnage () {
		return this.tonnage;
	}
			
	//toString 
	public String toString(){
		return String.format
		("\tCargo ship:\n\t%-20s\t%s\n\t%-20s\t%d\n\t%-20s\t%d",
		 "Cargo Name", getName(), "Ship Year", getYear(),
		 "Cargo Capacity", getTonnage());
	}
}
