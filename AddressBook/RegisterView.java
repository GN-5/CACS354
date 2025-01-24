package AddressBook;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class RegisterView extends JFrame {
    public RegisterView() {
        setSize(600, 500);
        setLocationRelativeTo(null);
        setTitle("Register Details");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        prepareGUI();
        setVisible(true);
    }

    JButton getButton() {
        JButton button = new JButton("Save");
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        return button;
    }

    JLabel getLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        return label;
    }

    JTextArea getTextArea() {
        JTextArea textArea = new JTextArea(1, 20); // Rows and columns
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        return textArea;
    }

    void prepareGUI() {
        Container window = getContentPane();
        window.setBackground(new Color(226, 226, 226));
        window.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        // Row 1: Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lblName = getLabel("Enter Name:");
        window.add(lblName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextArea txtName = getTextArea();
        window.add(txtName, gbc);

        // Row 2: Email
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel lblEmail = getLabel("Enter Email:");
        window.add(lblEmail, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JTextArea txtEmail = getTextArea();
        window.add(txtEmail, gbc);

        // Row 3: Latitude
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel lblLatitude = getLabel("Enter Latitude:");
        window.add(lblLatitude, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JTextArea txtLatitude = getTextArea();
        window.add(txtLatitude, gbc);

        // Row 4: Longitude
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel lblLongitude = getLabel("Enter Longitude:");
        window.add(lblLongitude, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        JTextArea txtLongitude = getTextArea();
        window.add(txtLongitude, gbc);

        // Row 5: Gender
        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel lblGender = getLabel("Gender:");
        window.add(lblGender, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        JRadioButton rdMale = new JRadioButton("Male");
        JRadioButton rdFemale = new JRadioButton("Female");

        // Group radios
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdMale);
        genderGroup.add(rdFemale);

        // Male
        window.add(rdMale, gbc);

        // Female
        gbc.gridx = 2;
        gbc.gridy = 4;
        window.add(rdFemale, gbc);

        // Row 6: Languages
        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel lblLanguage = getLabel("Languages:");
        window.add(lblLanguage, gbc);

        // First row of checkboxes
        gbc.gridx = 1;
        gbc.gridy = 5;
        JCheckBox cBoxJava = new JCheckBox("Java");
        JCheckBox cBoxPython = new JCheckBox("Python");
        window.add(cBoxJava, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        window.add(cBoxPython, gbc);

        // Second row of checkboxes
        gbc.gridx = 1;
        gbc.gridy = 6;
        JCheckBox cBoxC = new JCheckBox("C");
        JCheckBox cBoxJavaScript = new JCheckBox("JavaScript");
        window.add(cBoxC, gbc);

        gbc.gridx = 2;
        gbc.gridy = 6;
        window.add(cBoxJavaScript, gbc);

        // Row 7: Blood Group
        gbc.gridx = 0;
        gbc.gridy = 7;
        JLabel lblBloodGroup = getLabel("Blood Group:");
        window.add(lblBloodGroup, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> comboBoxBloodGroup = new JComboBox<>();
        comboBoxBloodGroup.addItem("A+");
        comboBoxBloodGroup.addItem("A-");
        comboBoxBloodGroup.addItem("B+");
        comboBoxBloodGroup.addItem("B-");
        comboBoxBloodGroup.addItem("AB+");
        comboBoxBloodGroup.addItem("AB-");
        comboBoxBloodGroup.addItem("O+");
        comboBoxBloodGroup.addItem("O-");
        window.add(comboBoxBloodGroup, gbc);

        // Row 8: Save Button
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton submitButton = getButton();
        window.add(submitButton, gbc);
    }

    public static void main(String[] args) {
        new RegisterView();
    }
}
