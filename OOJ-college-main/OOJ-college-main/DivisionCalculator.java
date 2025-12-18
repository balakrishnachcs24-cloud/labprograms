import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionCalculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public DivisionCalculator() {
        // Set up the frame
        setTitle("Integer Division Calculator");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the components
        JLabel num1Label = new JLabel("Num1: ");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Num2: ");
        num2Field = new JTextField(10);
        JLabel resultLabel = new JLabel("Result: ");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        divideButton = new JButton("Divide");

        // Add the components to the frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(divideButton);

        // Add action listener for the divide button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the input values
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Perform the division
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    // Handle non-integer input
                    JOptionPane.showMessageDialog(DivisionCalculator.this,
                            "Please enter valid integers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    // Handle division by zero
                    JOptionPane.showMessageDialog(DivisionCalculator.this,
                            "Cannot divide by zero.", "Math Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Create the frame and make it visible
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DivisionCalculator().setVisible(true);
            }
        });
    }
}
