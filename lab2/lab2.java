
import javax.swing.*;

public class lab2 {
    public static void main(String[] args) {

        Double sideA = Double.parseDouble(JOptionPane.showInputDialog("What is the length of side a?"));
        Double sideB = Double.parseDouble(JOptionPane.showInputDialog("What is the length of side b?"));
        Double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        hypotenuse *= 1000;
        hypotenuse = (double) (int) Math.round(hypotenuse);
        hypotenuse /= 1000;
        JOptionPane.showMessageDialog(null, "The hypotenuse is " + hypotenuse);
    
        Double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));
        Double area = Math.PI*radius*radius;
        Double peri = Math.PI*radius*2;
        area*=1000;
        area=  (double)(int)Math.round(area);
        area/=1000;
        peri*=1000;
        peri=  (double)(int)Math.round(peri);
        peri/=1000;
        JOptionPane.showMessageDialog(null,"The circle with radius "+radius+" has an area of "+area+" and a perimeter of "+ peri);
            


        int in = Integer.parseInt(JOptionPane.showInputDialog("Enter a number representing an amount of money from 1 dollar to 9999 dollars"));
        //int in = vin.intValue();
        int Grand  = in/1000;
        int Ben = (in%1000)/100;
        int Saw = (in%100)/10;
        int Bucks = (in%10);
        JOptionPane.showMessageDialog(null,Grand+" grands\n"+Ben+" Benjamins\n"+ Saw+" sawbucks\n"+Bucks+" bucks");
    }
}
