package MarksheetMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MarksheetView extends JFrame {

    private JTextField ootField;
    private JTextField oopField;
    private JTextField dbField;

    private JButton generateButton;
    private JButton closeButton;

    // Labels to display results
    private JLabel totalMarksLabel;
    private JLabel totalPercentageLabel;
    private JLabel divisionLabel;
    private JLabel resultLabel;

    public MarksheetView() {
        super("Marksheet Generator");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 5, 5));

        // Input fields
        add(new JLabel("Enter OOT Marks:"));
        ootField = new JTextField();
        add(ootField);

        add(new JLabel("Enter OOP Marks:"));
        oopField = new JTextField();
        add(oopField);

        add(new JLabel("Enter DB Marks:"));
        dbField = new JTextField();
        add(dbField);

        // Buttons
        generateButton = new JButton("Generate");
        closeButton = new JButton("CLOSE");
        add(generateButton);
        add(closeButton);

        // Result labels
        add(new JLabel("Total Marks"));
        totalMarksLabel = new JLabel("0.0");
        add(totalMarksLabel);

        add(new JLabel("Total Percentage"));
        totalPercentageLabel = new JLabel("0.0");
        add(totalPercentageLabel);

        add(new JLabel("Division (1st/2nd/3rd/Fail)"));
        divisionLabel = new JLabel("---");
        add(divisionLabel);

        add(new JLabel("Result (PASS/FAIL)"));
        resultLabel = new JLabel("---");
        add(resultLabel);
    }

    // getters
    public double getOOTMarks() {
        return Double.parseDouble(ootField.getText());
    }

    public double getOOPMarks() {
        return Double.parseDouble(oopField.getText());
    }

    public double getDBMarks() {
        return Double.parseDouble(dbField.getText());
    }

    // ----- Setters for output -----
    public void setTotalMarks(double total) {
        totalMarksLabel.setText(String.valueOf(total));
    }

    public void setTotalPercentage(double percentage) {
        totalPercentageLabel.setText(String.format("%.2f", percentage));
    }

    public void setDivision(String division) {
        divisionLabel.setText(division);
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    // listener
    public void addGenerateListener(ActionListener listener) {
        generateButton.addActionListener(listener);
    }

    public void addCloseListener(ActionListener listener) {
        closeButton.addActionListener(listener);
    }

    public void displayErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
