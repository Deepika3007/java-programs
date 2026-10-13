import javax.swing.*;
import java.awt.*;

public class TipCalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tip Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel titleLabel = new JLabel("Tip Calculator");
        JLabel billLabel = new JLabel("Bill Amount:");
        JLabel tipLabel = new JLabel("Tip Percentage:");
        JLabel resultLabel = new JLabel("Tip Amount: $0.00");
        JLabel errorLabel = new JLabel("");

        JTextField billField = new JTextField();
        JTextField tipField = new JTextField();

        JButton calculateButton = new JButton("Calculate Tip");
        JButton resetButton = new JButton("Reset");

        frame.add(titleLabel);
        frame.add(new JLabel(""));
        frame.add(billLabel);
        frame.add(billField);
        frame.add(tipLabel);
        frame.add(tipField);
        frame.add(calculateButton);
        frame.add(resetButton);
        frame.add(resultLabel);
        frame.add(errorLabel);

        calculateButton.addActionListener(e -> {
            try {
                double bill = Double.parseDouble(billField.getText());
                double percentage = Double.parseDouble(tipField.getText());

                if (bill < 0 || percentage < 0) {
                    errorLabel.setText("Enter positive values!");
                    resultLabel.setText("Tip Amount: $0.00");
                    return;
                }

                double tip = bill * percentage / 100;

                resultLabel.setText(String.format("Tip Amount: $%.2f", tip));
                errorLabel.setText("");

            } catch (NumberFormatException ex) {
                errorLabel.setText("Error: Please enter numbers.");
                resultLabel.setText("Tip Amount: $0.00");
            }
        });

        resetButton.addActionListener(e -> {
            billField.setText("");
            tipField.setText("");
            resultLabel.setText("Tip Amount: $0.00");
            errorLabel.setText("");
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
