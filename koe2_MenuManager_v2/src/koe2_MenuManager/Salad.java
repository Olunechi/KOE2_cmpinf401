package koe2_MenuManager;
/**
 * Class Salad
	 * author : Kenechi Ezekoye
 * created: 10/11/2022
 */
public class Salad {

	String Name;
	String description;
	int calories;
	public Salad(String name, String dscription,int clories) {
		Name = name;
		description = dscription;
		calories = clories;
	}
	
	public String getName() {
		return Name;
	}
	public String getDescription() {
		return description;
	}
	public int getCalories() {
		return calories;
	}

	public void setName(String Name) {
		Name = this.Name;
	}
	public void setDescription( String description) {
		description =  this.description;
	}
	public void setCalories(int calories) {
		calories = this.calories;
	}
	
	public static void main(String[] args) {
	}

}