import javax.swing.*;

public class pythag {
    public static void main(String[] args) {

        Double sideA = Double.parseDouble(JOptionPane.showInputDialog("What is the length of side a?"));
        Double sideB = Double.parseDouble(JOptionPane.showInputDialog("What is the length of side b?"));
        Double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        hypotenuse *= 1000;
        hypotenuse = (double) (int) Math.round(hypotenuse);
        hypotenuse /= 1000;
        JOptionPane.showMessageDialog(null, "The hypotenuse is " + hypotenuse);
    }
}
