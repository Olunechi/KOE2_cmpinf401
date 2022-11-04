package koe2_MenuManager;
/**
 * Class Menu
	 * author : Kenechi Ezekoye
 * created: 10/11/2022
 */
public class Menu {
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;
	String name;
	public Menu(String nme) {
		name = nme;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}
	Menu(String nme, Entree etree, Side sde){
		name = nme;
		entree = etree;
		side = sde;
		salad = null;
		dessert = null;
	}
	Menu(String nme, Entree etree, Side sde, Salad slad, Dessert dssert){
		name = nme;
		entree = etree;
		side = sde;
		salad = slad;
		dessert = dssert;
	}
	public int totalCalories(){
		int en = 0;
		if (entree !=null) {
			en = entree.calories;
		}
		int si = 0;
		if (side !=null) {
				si = side.calories;
			}
		int sa = 0;
		if (salad !=null) {
					sa = salad.calories;
				}
		int de = 0;
		if (dessert !=null) {
			de = dessert.calories;
					}
		return en+si+sa+de;
	}
	public String description(){
		String en ="Entree: "+  "N/A";
		if (entree !=null) {
			 en = "Entree: "+ entree.Name+". "+entree.description;
		}
		String si ="Side: "+  "N/A";

		if (side !=null) {
			 si = "Side: "+ side.Name+". "+side.description;
		}
		String sa ="Salad: "+ "N/A";

		if (salad !=null) {
			 sa = "Salad: "+ salad.Name+". "+salad.description;			
		}
		String de ="Dessert: "+  "N/A";
		if (dessert !=null) {
			 de = "Dessert: "+ dessert.Name+". "+dessert.description;	
		}
		return (en+"\n"+si+"\n"+sa+"\n"+de);
	}
	public static void main(String[] args) {}

}
