package koe2_MenuManager;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MenuManager {
	
	private ArrayList<Entree> entrees;
	private ArrayList<Salad> salads;
	private ArrayList<Side> sides;
	private ArrayList<Dessert> desserts;

	public MenuManager( String dishesFile) throws FileNotFoundException{
		ArrayList<MenuItem> items = 	FileManager.readItems(dishesFile);
		 entrees = new ArrayList<Entree>();
		 salads = new ArrayList<Salad>();
		 sides = new  ArrayList<Side>() ;
		 desserts = new ArrayList<Dessert>() ;

		Entree entree;
		Salad salad;
		Side side;
		Dessert dessert;
		for (MenuItem x: items) {
			
			if(x instanceof Entree) {
		entree = new Entree(x.getName(),x.getDescription(),x.getCalories(),x.getPrice());
				if(!(this.entrees.add(entree))) System.out.print("fk");;
				
			}
			
			if(x instanceof Salad) {
			salad = new Salad(x.getName(),x.getDescription(),x.getCalories(),x.getPrice());
				salads.add(salad);
			}
			
			if(x instanceof Side) {
			side = new Side(x.getName(),x.getDescription(),x.getCalories(),x.getPrice());
				sides.add(side);
			}
			
			if(x instanceof Dessert) {
		dessert = new Dessert(x.getName(),x.getDescription(),x.getCalories(),x.getPrice());
				desserts.add(dessert);
			}
			
		}	
		
		}
	
//	public void splitItems(ArrayList<MenuItem> items, ArrayList<Entree> entrees, ArrayList<Salad> salads, ArrayList<Side> sides, ArrayList<Dessert> desserts) {
//		for (MenuItem x: items) {
//			if(x instanceof Entree) {
//				entrees.add((Entree) x);
//			}
//			if(x instanceof Salad) {
//				salads.add((Salad) x);
//			}
//			if(x instanceof Side) {
//				sides.add((Side) x);
//			}
//			if(x instanceof Dessert) {
//				desserts.add((Dessert) x);
//			}
//		}
//	}
	
	public Menu randomMenu(String name) {
		Menu rm = new Menu(name, entrees.get((int) (entrees.size() * Math.random())), sides.get((int) (sides.size() * Math.random())), salads.get((int) (salads.size() * Math.random())), desserts.get((int) (desserts.size() * Math.random())));
		return rm;
		}
	public Menu minCaloriesMenu() {
		Menu minMenu = new Menu("");
		Entree minEntree = new Entree(null, null, 0, 0); Salad minSalad = new Salad(null, null, 0, 0); Side minSide = new Side(null, null, 0, 0); Dessert minDessert = new Dessert(null, null, 0, 0);
		int calE = 10000, calS1 = 10000, calS2 = 10000, calD = 10000;
		for (Entree x: entrees) {
			if(x.getCalories()<calE) {
				calE = x.getCalories();
				minEntree = x;
			}
		}
		for (Salad x: salads) {
			if(x.getCalories()<calS1) {
				calS1 = x.getCalories();
				minSalad = x;
			}
		}
		for (Side x: sides) {
			if(x.getCalories()<calS2) {
				calS2 = x.getCalories();
				minSide = x;
			}
		}
		for (Dessert x: desserts) {
			if(x.getCalories()<calD) {
				calD = x.getCalories();
				minDessert = x;
			}
		}
		minMenu = new Menu("minMenu",minEntree,minSide,minSalad,minDessert);
		return minMenu;
	}
	public Menu maxCaloriesMenu() {
		Menu maxMenu = new Menu("");
		Entree maxEntree = new Entree(null, null, 0, 0); Salad maxSalad = new Salad(null, null, 0, 0); Side maxSide = new Side(null, null, 0, 0); Dessert maxDessert = new Dessert(null, null, 0, 0);
		int calE = 0, calS1 = 0, calS2 = 0, calD = 0;
		for (Entree x: entrees) {
			if(x.getCalories()>calE) {
				calE = x.getCalories();
				maxEntree = x;
			}
		}
		for (Salad x: salads) {
			if(x.getCalories()>calS1) {
				calS1 = x.getCalories();
				maxSalad = x;
			}
		}
		for (Side x: sides) {
			if(x.getCalories()>calS2) {
				calS2 = x.getCalories();
				maxSide = x;
			}
		}
		for (Dessert x: desserts) {
			if(x.getCalories()>calD) {
				calD = x.getCalories();
				maxDessert = x;
			}
		}
		maxMenu = new Menu("maxMenu",maxEntree,maxSide,maxSalad,maxDessert);
		return maxMenu;
	}
	public ArrayList<Menu> menuList(){
		ArrayList<Menu> menus = new ArrayList<Menu>();
		for (int x = 1; x< 11; x++) {			
		menus.add(randomMenu("Menu"+x));
		}
		return menus;
	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

}
