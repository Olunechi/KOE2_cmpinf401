package koe2_MenuManager;
/**
 * Class MenuTest
	 * author : Kenechi Ezekoye
 * created: 10/11/2022
 */

public class MenuTest {

	public static void main(String[] args) {
		Entree sir = new Entree("Sirloin ","A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked",100);
		//System.out.println(sir.calories);
		Entree ste = new Entree("Steak ","A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked",100);
		Salad cae = new Salad("Caesar Salad","Premium quality romain mixed with chicken", 75);
		Salad pot = new Salad("Potato Salad","Premium quality potato mixed with mustard", 75);
		Side ric = new Side("Rice and Avocado","Premium quality indian rice mixed with avocado", 50);
		Dessert moo = new Dessert("Moose","Chocolate delight", 200);
		Menu menu1 = new Menu("Primary",sir,null,cae,null);
		Menu menu2 = new Menu("Secondary",ste,ric,pot,moo);
		System.out.println(menu1.name);//+" name");
		System.out.println(menu1.totalCalories());//+"totcal");
		System.out.println(menu1.description());//+"descr");
		System.out.println(menu2.name);//+"name");
		System.out.println(menu2.totalCalories());//+"totcal");
		System.out.println(menu2.description());//+"descrip");
	}

}
