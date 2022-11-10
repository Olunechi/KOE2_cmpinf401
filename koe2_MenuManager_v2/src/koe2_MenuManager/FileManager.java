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
	 */
	public static ArrayList<Entree> readEntrees(String fileName) {
		/////////// /**/*\*/*/ File file;
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		try {
			// file = new File(fileName);
			Scanner scan = new Scanner(new File(fileName));
			String entree = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				Entree entry = new Entree(entree.split("@@")[0], entree.split("@@")[1],
						Integer.parseInt(entree.split("@@")[2]));
				entrees.set(x, entry);
				x++;
				entree = scan.nextLine();
			}
			scan.close();

		} catch (Exception a) {

		}
		return (entrees);
	}

	/**
	 * Method readSides
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of sides
	 */
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sides = new ArrayList<Side>();
		try {
			// file = new File(fileName);
			Scanner scan = new Scanner(new File(fileName));
			String side = scan.nextLine();
			int x = 0;
			while (scan.hasNextLine()) {
				Side siid = new Side(side.split("@@")[0], side.split("@@")[1], Integer.parseInt(side.split("@@")[2]));
				sides.set(x, siid);
				x++;
				side = scan.nextLine();
			}
			System.out.println(sides);

			scan.close();

		} catch (Exception a) {

			System.out.println("blood");
		}
		return (sides);
	}

	/**
	 * Method readSalads
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of salads
	 */
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> salads = new ArrayList<Salad>();
		try {
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

		} catch (Exception a) {

		}
		return (salads);
	}

	/**
	 * Method readDesserts
	 * 
	 * @param fileName a String name
	 * @return the ArrayList of desserts
	 */
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		try {
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

		} catch (Exception a) {

		}
		return (desserts);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
