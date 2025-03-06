package CalculatorMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private JTextField firstNumberField;
    private JTextField secondNumberField;

    private JRadioButton addButton;
    private JRadioButton subButton;
    private JRadioButton mulButton;
    private JRadioButton divButton;
    private ButtonGroup operationGroup;

    private JButton calculateButton;
    private JButton closeButton;

    public CalculatorView() {
        setTitle("Calculator");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 5, 5));
        prepareGUI();
    }

    public void prepareGUI() {
        Container window = getContentPane();
        // First number
        window.add(new JLabel("Enter first no :"));
        firstNumberField = new JTextField();
        window.add(firstNumberField);

        // Second number
        window.add(new JLabel("Enter second no :"));
        secondNumberField = new JTextField();
        window.add(secondNumberField);

        // Radio Buttons
        addButton = new JRadioButton("Add");
        subButton = new JRadioButton("Sub");
        mulButton = new JRadioButton("Mul");
        divButton = new JRadioButton("Div");

        operationGroup = new ButtonGroup();
        operationGroup.add(addButton);
        operationGroup.add(subButton);
        operationGroup.add(mulButton);
        operationGroup.add(divButton);

        addButton.setSelected(true);

        window.add(addButton);
        window.add(subButton);
        window.add(mulButton);
        window.add(divButton);

        calculateButton = new JButton("Calculate");
        closeButton = new JButton("Close");

        window.add(calculateButton);
        window.add(closeButton);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumberField.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumberField.getText());
    }

    public boolean isAddSelected() {
        return addButton.isSelected();
    }

    public boolean isSubSelected() {
        return subButton.isSelected();
    }

    public boolean isMulSelected() {
        return mulButton.isSelected();
    }

    public boolean isDivSelected() {
        return divButton.isSelected();
    }

    public void addCalculateListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }

    public void addCloseListener(ActionListener listener) {
        closeButton.addActionListener(listener);
    }

    public void displayErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void displayResult(double result) {
        JOptionPane.showMessageDialog(this, "Result: " + result);
    }
}
