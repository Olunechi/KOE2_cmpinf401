package koe2_MenuManager;

public class MenuItem {

	private String name;
	private String description;
	private int calories;
	private double price;
	
	MenuItem(String name, String desc, int cal, double price){
		this.name = name;
		description = desc;
		calories = cal;
		this.price = price;

	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getCalories() {
		return calories;
	}
	
	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		name = this.name;
	}
	
	public void setDescription( String description) {
		description =  this.description;
	}
	
	public void setCalories(int calories) {
		calories = this.calories;
	}
	
	public void setPrice(double price) {
		price = this.price;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
