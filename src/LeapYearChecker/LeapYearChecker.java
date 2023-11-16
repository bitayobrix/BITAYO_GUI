import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        JTextField tfYear = new JTextField();
        JButton btnCheckYear = new JButton("Check Year");

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputYear = tfYear.getText();
                if (isLeapYear(inputYear)) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Year:"));
        panel.add(tfYear);
        panel.add(btnCheckYear);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static boolean isLeapYear(String year) {
        try {
            int numericYear = Integer.parseInt(year);
            return (numericYear % 4 == 0 && numericYear % 100 != 0) || (numericYear % 400 == 0);
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            return false;
        }
    }
}
