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
	 */
	public static ArrayList<Entree> readEntrees(String fileName) throws Exception {
		/////////// /**/*\*/*/ File file;
		ArrayList<Entree> entrees = new ArrayList<Entree>();
	
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			//String entree = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				String[] entreeSplit  = scan.nextLine().split("@@");
				Entree entry = new Entree(entreeSplit[0], entreeSplit[1],
						Integer.parseInt(entreeSplit[2]));
				entrees.set(x, entry);
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
	 */
	public static ArrayList<Side> readSides(String fileName) throws Exception {
		ArrayList<Side> sides = new ArrayList<Side>();
			File file = new File(fileName);
			Scanner scan = new Scanner(file);//new File(fileName));
			//String side = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				String[] sideSplit  = scan.nextLine().split("@@",2);
				Side siid = new Side(sideSplit[0], sideSplit[1], Integer.parseInt(sideSplit[2]));
				sides.set(x, siid);
				x++;
				//side = scan.nextLine();
			}

			scan.close();


			System.out.println(sides);
			System.out.println("blood");
		
		return (sides);
	}

	/**
	 * Method readSalads
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of salads
	 */
	public static ArrayList<Salad> readSalads(String fileName) throws FileNotFoundException{
		ArrayList<Salad> salads = new ArrayList<Salad>();
	
			// file = new File(fileName);
			Scanner scan = new Scanner(new File(fileName));
			String salad = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				Salad slad = new Salad(salad.split("@@")[0], salad.split("@@")[1], Integer.parseInt(salad.split("@@")[2]));
				salads.set(x, slad);
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
	 */
	public static ArrayList<Dessert> readDesserts(String fileName) throws FileNotFoundException {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
			// file = new File(fileName);
			Scanner scan = new Scanner(new File(fileName));
			String dessert = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				Dessert desrt = new Dessert(dessert.split("@@")[0], dessert.split("@@")[1],
						Integer.parseInt(dessert.split("@@")[2]));
				desserts.set(x, desrt);
				x++;
				dessert = scan.nextLine();
			}
			scan.close();

		return (desserts);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
