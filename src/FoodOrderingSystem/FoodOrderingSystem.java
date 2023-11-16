package FoodOrderingSystem;

import SimpleCalculator.SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FoodOrderingSystem extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSundae;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel jpanel;

    public FoodOrderingSystem() {
        setContentPane(jpanel);
        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Food Ordering System");
    btnOrder.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            double totalPrice = 0;
            double discountAmount = 0;
            DecimalFormat df = new DecimalFormat("#.##");

            if (cPizza.isSelected()) totalPrice += 100;
            if (cBurger.isSelected()) totalPrice += 80;
            if (cFries.isSelected()) totalPrice += 65;
            if (cSundae.isSelected()) totalPrice += 40;
            if (cSoftDrinks.isSelected()) totalPrice += 25;
            if (cTea.isSelected()) totalPrice += 50;

            if (rbNone.isSelected()) {
                discountAmount = 0;
            } else if (rb5.isSelected()) {
                discountAmount = totalPrice * 0.05;
            } else if (rb10.isSelected()) {
                discountAmount = totalPrice * 0.10;
            } else if (rb15.isSelected()) {
                discountAmount = totalPrice * 0.15;
            }

            totalPrice -= discountAmount;

            JOptionPane.showMessageDialog(null, "The total price is " + df.format(totalPrice));
        }
    });
}

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
    }
}
