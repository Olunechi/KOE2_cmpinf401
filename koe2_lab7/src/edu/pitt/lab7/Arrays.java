package edu.pitt.lab7;
 import java.util.*;

import javax.swing.JOptionPane;
public class Arrays {
	public static double max(double [] data) {
		 double goal = data[0];
		for(double x : data) {
			 if (x>goal) {
				 goal = x;
			 }
		 }
		return goal;
	}
	public static double min(double [] data) {
		 double goal = data[0];
		for(double x : data) {
			 if (x<goal) {
				 goal = x;
			 }
		 }		
		return goal;
	}
	public static double sum(double [] data) {
		 double goal = 0;
		for(double x : data) {
			 goal+=x;
		 }
		return goal;
	}
	public static double ave(double [] data) {
		 double goal = 0;
		for(double x : data) {
			 goal+=x;
		 }
		goal/= data.length;
		return goal;
	}
			
	public static void main(String[] args) {
		int sizeOf = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer representing the size of the array"));
		double [] data = new double[sizeOf];
		for (int i = 0; i<sizeOf;  i++) {
			data[i] = Math.random();
		}
		System.out.println("Max: "+max(data)+"\nMin: "+min(data)+"\nSum: "+sum(data)+"\nAverage: "+ave(data));
	}

}
