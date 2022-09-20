package edu.pitt.lab3;
import javax.swing.*;
public class UnitConverter {

	public static void main(String[] args) {
		String in = (JOptionPane.showInputDialog("Enter a weight or distance amount in the format of \"amount unit\""));
		String[] pie = in.split(" ", 2);
		double origNum = Double.parseDouble(pie[0]);
		String origUnit = pie[1];
		double convNum = 0;
		String convUnit = "";
		if(origUnit.equals("cm")) {
			 convNum = 0.3937*origNum;
			 convUnit = " in";
		}
		else if(origUnit.equals("in")) {
			 convNum = 2.54 * origNum;
			 convUnit = " cm";
}
		else if(origUnit.equals("yd")) {
			 convNum = 0.9144*origNum;
			 convUnit = " m";
}
		else if(origUnit.equals("m")) {
			 convNum = 1.0936*origNum;
			 convUnit = " yd";
		}
		else if(origUnit.equals("oz")) {
			 convNum = 28.35*origNum;
			 convUnit = " gm";
		}
		else if(origUnit.equals("gm")) {
			 convNum = 0.0353*origNum;
			 convUnit = " oz";
		}
		else if(origUnit.equals("lb")) {
			 convNum = 0.4536*origNum;
			 convUnit = " kg";
		}
		else if(origUnit.equals("kg")) {
			 convNum = 2.2046*origNum;
			 convUnit = " lb";
		}
		JOptionPane.showMessageDialog(null, in+" = "+convNum+convUnit);
	}

}
