package AddressBook;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

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
        JButton button = new JButton();
        button.setText("Submit");
        button.setSize(200, 100);
        return button;
    }

    JLabel getLabel() {
        JLabel jLbl = new JLabel();
        jLbl.setSize(300, 100);

        return jLbl;
    }

    JTextArea setTextArea() {
        JTextArea jTxt = new JTextArea();
        jTxt.setSize(500, 100);
        jTxt.setFont(getFont());
        return jTxt;
    }

    void prepareGUI() {
        Container window = getContentPane();
        window.setBackground(new Color(226, 226, 226));
        JLabel lblName = getLabel();
        JLabel lblEmail = getLabel();

        JTextArea txtName = setTextArea();
        JTextArea txtEmail = setTextArea();

        lblName.setText("Enter Name");
        lblEmail.setText("Enter Email");

        window.setLayout(new FlowLayout());
        window.add(lblName);
        window.add(txtName);
        window.add(lblEmail);
        window.add(txtEmail);
        window.add(getButton());
    }

    public static void main(String[] args) {
        new ContactView();

    }
}
