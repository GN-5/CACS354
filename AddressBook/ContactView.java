package AddressBook;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ContactView extends JFrame {

    public ContactView() {
        setSize(600, 500);
        setLocationRelativeTo(null);
        setTitle("Contact Book");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        prepareGUI();
        setVisible(true);
    }

    JButton getButton() {
        JButton button = new JButton("Submit");
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        return button;
    }

    JLabel getLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        return label;
    }

    JTextArea getTextArea() {
        JTextArea textArea = new JTextArea(1, 10);
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

        // lblEmail
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lblEmail = getLabel("Enter Email:");
        window.add(lblEmail, gbc);

        // txtEmail
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        JTextArea txtName = getTextArea();
        window.add(txtName, gbc);

        // lblPassword
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lblPassword = getLabel("Enter Password:");
        window.add(lblPassword, gbc);

        // txtPassword
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        JTextArea txtPassword = getTextArea();
        window.add(txtPassword, gbc);

        // btn
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton submitButton = getButton();
        window.add(submitButton, gbc);
    }

    public static void main(String[] args) {
        new ContactView();
    }
}
