//Ship superclass
public class Ship implements Comparable<Ship>{
	//Data fields
	private String name;
	private int year;
	
	//No argument constructor 
	public Ship () {
		this.name = "No name";
		this.year = 1776;
	}
	
	//Overloaded constructor (Accepts name and year)
	public Ship (String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	//Accessors and mutators for name and year
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
	
	//toString 
	public String toString(){
		return String.format
		("\tBasic Ship:\n\t%-20s\t%s\n\t%-20s\t%d",
		 "Ship Name", getName(), "Ship Year", getYear());
	}

	//Comparable
	public int compareTo (Ship o) {
		Integer thisYear = Integer.valueOf(this.getYear());
		Integer oYear = Integer.valueOf(o.getYear());
		int yearComparison = thisYear.compareTo(oYear);
		if (yearComparison == 0) {
			if (yearComparison > 0)
				return -1;
			else if (yearComparison < 0)
				return 1;
			else
				return 0;
		}
		return yearComparison;
	}
}
	
