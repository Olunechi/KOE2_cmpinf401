package edu.pitt.lab4;

import javax.swing.JOptionPane;

public class Lab4 {

	public static void main(String[] args) {
		int log = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer representing the log"));
while (log<1) {
	 log = Integer.parseInt(JOptionPane.showInputDialog("Enter a valid integer (X>0) representing the log"));
}
		int base = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer representing the base"));
		while (base<=1) {
			 base = Integer.parseInt(JOptionPane.showInputDialog("Enter a valid integer (b>1) representing the log"));
		}
double sum = base;
int y = 0;
//while(sum<log) {
//	 sum = base;
//	sum = ((Math.pow(sum, y)));
//	y++;
//}
//y-=1;

while(log>=base) {
	log/=base;
	y++;
}
JOptionPane.showMessageDialog(null, "The floor is "+y);

	}

}
