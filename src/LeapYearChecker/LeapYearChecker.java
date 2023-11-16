package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public LeapYearChecker() {
        setContentPane(jpanel);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Leap Year Checker");
        tfYear.setHorizontalAlignment(JTextField.CENTER);

        btnCheckYear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(tfYear.getText());
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            JOptionPane.showMessageDialog(null, "Leap year");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not a leap year");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
    }
}