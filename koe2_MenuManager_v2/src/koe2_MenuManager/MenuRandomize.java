package koe2_MenuManager;

import java.util.ArrayList;

public class MenuRandomize {
	/**
	 * Class MenuRandomize author : Kenechi Ezekoye created: 11/02/2022
	 */
	private ArrayList<Entree> entrees;
	private ArrayList<Salad> salads;
	private ArrayList<Side> sides;
	private 	ArrayList<Dessert> desserts;
	
	/**
	 * Constructor MenuRandomize
	 * 
	 * @param entreeFile a String file name
	 * @param sideFile a String file name
	 * @param saladFile a String file name
	 * @param dessertFile a String file name
	 */
	MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) throws Exception {

		entrees = FileManager.readEntrees(entreeFile);
		salads = FileManager.readSalads(saladFile);
		sides = FileManager.readSides(sideFile);
		desserts = FileManager.readDesserts(dessertFile);
	}

	/**
	 * Method randomMenu
	 * 
	 * @return the Menu of random items
	 */
	public Menu randomMenu() {
		Menu rm = new Menu("randome", entrees.get((int) (entrees.size() * Math.random())),
				sides.get((int) (sides.size() * Math.random())), salads.get((int) (salads.size() * Math.random())),
				desserts.get((int) (desserts.size() * Math.random())));
		return rm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
