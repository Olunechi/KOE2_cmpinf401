package koe2_MenuManager;
import java.io.File;
import java.util.*;
public class FileManager {

	public static ArrayList<Entree> readEntrees(String fileName){
      /////////// /**/*\*/*/  File file;
		ArrayList<Entree> entrees = new ArrayList<Entree>();
        try {
       // file = new File(fileName);
        Scanner scan = new Scanner(new File(fileName));
        String entree = scan.nextLine();
        while(scan.hasNextLine()) {
        	
        }
        scan.close();
            
        } catch (Exception a) {
            
        }
		return (entrees);
	}
	public static ArrayList<Side> readSides(String fileName){
		ArrayList<Side> sides = new ArrayList<Side>();
        try {
       // file = new File(fileName);
        Scanner scan = new Scanner(new File(fileName));
        String side = scan.nextLine();
        while(scan.hasNextLine()) {
        	
        }
        scan.close();
            
        } catch (Exception a) {
            
        }
		return (sides);
	}
	public static ArrayList<Salad> readSalads(String fileName){
		ArrayList<Salad> salads = new ArrayList<Salad>();
        try {
       // file = new File(fileName);
        Scanner scan = new Scanner(new File(fileName));
        String salad = scan.nextLine();
        while(scan.hasNextLine()) {
        	
        }
        scan.close();
            
        } catch (Exception a) {
            
        }
		return (salads);	}
	public static ArrayList<Dessert> readDesserts(String fileName){
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
        try {
       // file = new File(fileName);
        Scanner scan = new Scanner(new File(fileName));
        String dessert = scan.nextLine();
        while(scan.hasNextLine()) {
        	
        }
        scan.close();
            
        } catch (Exception a) {
            
        }
		return (desserts);	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 