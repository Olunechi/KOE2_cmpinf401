package koe2_MenuManager;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MenuManager2 {
	
	private ArrayList<Entree> entrees;
	private ArrayList<Salad> salads;
	private ArrayList<Side> sides;
	private ArrayList<Dessert> desserts;

	public MenuManager2( String dishesFile) throws FileNotFoundException{
		splitItems(FileManager.readItems(dishesFile),entrees, salads, sides, desserts);
		//System.out.println("Y");
	}
	
	public void splitItems(ArrayList<MenuItem> items, ArrayList<Entree> entrees, ArrayList<Salad> salads, ArrayList<Side> sides, ArrayList<Dessert> desserts) {
		for (MenuItem x: items) {
			if(x instanceof Entree) {
				entrees.add((Entree) x);
			}
			if(x instanceof Salad) {
				salads.add((Salad) x);
			}
			if(x instanceof Side) {
				sides.add((Side) x);
			}
			if(x instanceof Dessert) {
				desserts.add((Dessert) x);
			}
		}
	}
	
	public Menu randomMenu(String name) {
		Menu rm = new Menu(name, entrees.get((int) (entrees.size() * Math.random())), sides.get((int) (sides.size() * Math.random())), salads.get((int) (salads.size() * Math.random())), desserts.get((int) (desserts.size() * Math.random())));
		return rm;
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
