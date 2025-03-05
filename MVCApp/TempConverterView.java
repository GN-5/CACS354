package MVCApp;

import javax.swing.*;
import java.awt.*;

public class TempConverterView extends JFrame {

    public JLabel inputLabel = new JLabel("Enter temperature:");
    public JTextField inputField = new JTextField(10);

    public JLabel conversionLabel = new JLabel("Select conversion:");
    public JComboBox<String> conversionComboBox;

    public JLabel outputLabel = new JLabel("Converted temperature:");
    public JTextField outputField = new JTextField(10);

    public JButton convertButton = new JButton("Convert");

    public TempConverterView() {
        setTitle("Temperature Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        prepareGUI();
        setVisible(true);
    }

    void prepareGUI() {
        // Define the available conversion options.
        String[] conversionOptions = {
                "Kelvin to Celsius",
                "Celsius to Kelvin",
                "Celsius to Fahrenheit",
                "Fahrenheit to Celsius",
                "Fahrenheit to Kelvin",
                "Kelvin to Fahrenheit"
        };
        conversionComboBox = new JComboBox<>(conversionOptions);

        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.add(inputLabel);
        window.add(inputField);
        window.add(conversionLabel);
        window.add(conversionComboBox);
        window.add(outputLabel);
        window.add(outputField);
        window.add(convertButton);
    }

    public static void main(String[] args) {
        new TempConverterView();
    }
}
