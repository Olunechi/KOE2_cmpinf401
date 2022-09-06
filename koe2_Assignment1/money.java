import javax.swing.*;
public class money {
    public static void main(String[] args) {

int in = Integer.parseInt(JOptionPane.showInputDialog("Enter a number representing an amount of money from 1 dollar to 9999 dollars"));
//int in = vin.intValue();
int Grand  = in/1000;
int Ben = (in%1000)/100;
int Saw = (in%100)/10;
int Bucks = (in%10);
JOptionPane.showMessageDialog(null,Grand+" grands\n"+Ben+" Benjamins\n"+ Saw+" sawbucks\n"+Bucks+" bucks");
    }
}
