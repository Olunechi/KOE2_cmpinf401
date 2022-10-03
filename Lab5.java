package edu.pitt.lab5;
import java.util.*;

import javax.swing.JOptionPane;

public class Lab5 {

	public static void main(String[] args) {
Random rd = new Random();//make random object
boolean play = false;
while( play == false) {
int numR = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer representing the number of rolls"));
RollDice(numR,rd);
int keep = Integer.parseInt(JOptionPane.showInputDialog("play again? 1 for \"Yes\" or 2 for \"No\""));
if (keep == 2) {
	play = true;
}

}

	}
	public static void RollDice( int numR, Random rd) {
		//ArrayList<int[]> rolls = new ArrayList<int[]>();//array-list of roll value and its total rolls
		int frac[][] = new int[11][2];
		for(int x = 2; x<=12; x++) {
			frac[x-2][0]=x;
			frac[x-2][1]=0;// list of roll value from 2 to 12 and roll fraction
			//JOptionPane.showMessageDialog(null,frac[x-2][0] );//rolls.get(0));
			//rolls.add(frac);// add list to array

		}
		for(int x = 0; x<numR; x++) {
			int d1 = 1+rd.nextInt(6);//dice one roll value
			int d2 = 1+rd.nextInt(6);//dice two roll value
			int sum = d1+d2;//total roll value
			int getF = frac[sum-2][1];//gets current total of roll value 
			frac[sum-2][1]= getF+1;
			//int[] rep = {sum,getF+1};// value of new list
			//int[] i = rolls.set(sum-2,rep);//replace old total with new
			//JOptionPane.showMessageDialog(null, frac[sum-2][1]);//rolls.get(x));

		}
		for(int x = 0; x<=10; x++) {
			//int getT = frac[x][1];//gets current total of roll value 
			//int realF = getT/numR;
			//frac[x][1]++;
			//int[] rep = {x,realF};// value of new list
			//int[] i = rolls.set(x,rep);//replace old total with new fraction
			System.out.println(frac[x][0]+" "+frac[x][1]+"/"+numR);// rolls.get(x));
		//	numR = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer representing the number of rolls"));

		//	JOptionPane.showMessageDialog(null, frac[x][0]+" "+frac[x][1]);// rolls.get(x));
		}
		
	}
}