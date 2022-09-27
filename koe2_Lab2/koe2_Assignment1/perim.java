import javax.swing.*;
public class perim {
    public static void main(String[] args) {

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
    }
}
