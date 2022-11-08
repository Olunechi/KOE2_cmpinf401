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
	public Entree getMenuEntree(){
		return entree;
	}
	public Side getMenuSide(){
		return side;
	}
	public Salad getMenuSalad(){
		return salad;
	}
	public Dessert getMenuDessert(){
		return dessert;
	}
	
	public void setMenuEntree(Entree entree) {
		entree = this.entree;
	}
	
	
	public void setMenuSide(Side side) {
		side = this.side;
	}
	
	
	public void setMenuSalad(Salad salad) {
		salad = this.salad;
	}
	
	public void setMenuDessert(Dessert dessert) {
		dessert = this.dessert;
	}
	

	public int totalCalories(){
		int en = 0;
		if (entree !=null) {
			en = entree.getCalories();
		}
		int si = 0;
		if (side !=null) {
				si = side.getCalories();
			}
		int sa = 0;
		if (salad !=null) {
					sa = salad.getCalories();
				}
		int de = 0;
		if (dessert !=null) {
			de = dessert.getCalories();
					}
		return en+si+sa+de;
	}
	public String description(){
		String en ="Entree: "+  "N/A";
		if (entree !=null) {
			 en = "Entree: "+ entree.getName()+". "+entree.getDescription();
		}
		String si ="Side: "+  "N/A";

		if (side !=null) {
			 si = "Side: "+ side.getName()+". "+side.getDescription();
		}
		String sa ="Salad: "+ "N/A";

		if (salad !=null) {
			 sa = "Salad: "+ salad.getName()+". "+salad.getDescription();			
		}
		String de ="Dessert: "+  "N/A";
		if (dessert !=null) {
			 de = "Dessert: "+ dessert.getName()+". "+dessert.getDescription();	
		}
		return (en+"\n"+si+"\n"+sa+"\n"+de);
	}
	public static void main(String[] args) {}

}
