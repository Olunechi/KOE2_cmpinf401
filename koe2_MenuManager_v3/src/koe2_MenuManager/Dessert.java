package koe2_MenuManager;
/**
 * Class Dessert
	 * author : Kenechi Ezekoye
 * created: 10/11/2022
 */
public class Dessert extends MenuItem{

	 Dessert(String name, String desc, int cal, double price) {
	super(name, desc, cal, price);
	super.getName(); super.getDescription(); super.getCalories(); super.getPrice();
	super.setName(name); super.setDescription(desc); super.setCalories(cal); super.setPrice(price);
	 }
	
	
}
