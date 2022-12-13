package koe2_MenuManager;

import java.io.*;
import java.util.*;

public class FileManager {
	/**
	 * Class FileManager author : Kenechi Ezekoye created: 11/02/2022
	 */

	/**
	 * Method readEntrees
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of entrees
	 * @throws FileNotFoundException 
	 * /
/*	public static ArrayList<Entree> readEntrees(String fileName) throws Exception {
		/////////// / File file;
		ArrayList<Entree> entrees = new ArrayList<Entree>();
	
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			//zzzxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzzzzzszzzzzzxxxxxxxxxxzsssssssssssdzString entree = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				String[] entreeSplit  = scan.nextLine().split("@@");
				Entree entry = new Entree(entreeSplit[0], entreeSplit[1],
						Integer.parseInt(entreeSplit[2]));
				entrees.add(entry);	//entrees.set(x, entry);
				x++;
			//	entree = scan.nextLine();
			}
			scan.close();

		return (entrees);
	}

	/**
	 * Method readSides
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of sides
	 * /
	public static ArrayList<Side> readSides(String fileName) throws Exception {
		ArrayList<Side> sides = new ArrayList<Side>();
			File file = new File(fileName);
			Scanner scan = new Scanner(file);//new File(fileName));
			//String side = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				String[] sideSplit  = scan.nextLine().split("@@");
				Side siid = new Side(sideSplit[0], sideSplit[1], Integer.parseInt(sideSplit[2]));
				sides.add(siid);//sides.set(x, siid);
				x++;
				//side = scan.nextLine();
			}

			scan.close();


		
		return (sides);
	}

	/**
	 * Method readSalads
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of salads
	 * /
	public static ArrayList<Salad> readSalads(String fileName) throws FileNotFoundException{
		ArrayList<Salad> salads = new ArrayList<Salad>();
	
			// file = new File(fileName);
			Scanner scan = new Scanner(new File(fileName));
			String salad = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				Salad slad = new Salad(salad.split("@@")[0], salad.split("@@")[1], Integer.parseInt(salad.split("@@")[2]));
				salads.add(slad);//.set(x, slad);
				x++;
				salad = scan.nextLine();
			}
			scan.close();

		return (salads);
	}

	/**
	 * Method readDesserts
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of desserts
	 * /
	public static ArrayList<Dessert> readDesserts(String fileName) throws FileNotFoundException {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
			// file = new File(fileName);
			Scanner scan = new Scanner(new File(fileName));
			String dessert = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				Dessert desrt = new Dessert(dessert.split("@@")[0], dessert.split("@@")[1],
						Integer.parseInt(dessert.split("@@")[2]));
				desserts.add(desrt);//desserts.set(x, desrt);
				x++;
				dessert = scan.nextLine();
			}
			scan.close();

		return (desserts);
	}*/
	/**
	 * Method readItems
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of Items
	 */

	public static ArrayList<MenuItem> readItems(String fileName) throws FileNotFoundException{
		ArrayList<MenuItem> items = new ArrayList<MenuItem>();
		Scanner scan = new Scanner(new File(fileName));
		String item = scan.nextLine();
		while (scan.hasNextLine()) {
			MenuItem itm = new MenuItem(item.split("@@")[1], item.split("@@")[2],Integer.parseInt(item.split("@@")[3]),Double.parseDouble(item.split("@@")[4]));
			if(item.split("@@")[1].equals("entree")) {
				 itm = new Entree(item.split("@@")[0], item.split("@@")[2],
						Integer.parseInt(item.split("@@")[3]),Double.parseDouble(item.split("@@")[4]));
				 }
			else if(item.split("@@")[1].equals("side")) {
				 itm = new Side(item.split("@@")[0], item.split("@@")[2],
						Integer.parseInt(item.split("@@")[3]),Double.parseDouble(item.split("@@")[4]));
				 }
			else if(item.split("@@")[1].equals("salad")) {
				 itm = new Salad(item.split("@@")[0], item.split("@@")[2],
						Integer.parseInt(item.split("@@")[3]),Double.parseDouble(item.split("@@")[4]));
				 }
			else if(item.split("@@")[1].equals("dessert")) {
				 itm = new Dessert(item.split("@@")[0], item.split("@@")[2],
						Integer.parseInt(item.split("@@")[3]),Double.parseDouble(item.split("@@")[4]));
				 }
			items.add(itm);
			item = scan.nextLine();
		}
		scan.close();

	return (items);

	}

	public static void writeMenu( String fileName, ArrayList<Menu> menus ) throws IOException {
		FileWriter fw = new FileWriter(fileName);
//	MenuManager test = new  MenuManager("data/dishes.txt");
//	 menus = test.menuList();
//	 System.out.println(menus+"Max:  "+test.maxCaloriesMenu()+test.maxCaloriesMenu().totalCalories()+test.maxCaloriesMenu().description()+"Min:  "+test.minCaloriesMenu()+test.minCaloriesMenu().description()+test.minCaloriesMenu().totalCalories());
	for(Menu x: menus) {
		fw.write("Menu name: "+x+" Total Calories: "+x.totalCalories()+" total Price: "+x.totalPrice()+" Descripetion: "+x.description()+"\n");
		}
		fw.close();
		
	}

	
	public static void main(String[] args) throws IOException{
		ArrayList<Menu> menus =  new ArrayList<Menu>();
		writeMenu("data/output.txt", menus);
	}

}
