package koe2_MenuManager;

public class MenuTester {
	/**
	 * Class MenuTester author : Kenechi Ezekoye created: 11/02/2022
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt", "data/sides.txt", "data/salads.txt",
				"data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description() + "\nTotal calories" + myMenu.totalCalories());
	}
}
