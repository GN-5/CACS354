package AddressBook;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutTest extends JFrame {
    ImageIcon icon = new ImageIcon(".imgs/save.png");
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");

    GridBagLayoutTest() {
        setSize(500, 500);
        setTitle("BorderLayoutTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        prepareGUI();
        setVisible(true);
    }

    void prepareGUI() {
        Container window = getContentPane();
        window.setBackground(new Color(226, 226, 226));
        window.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        window.add(btn1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        window.add(btn2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        window.add(btn3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        window.add(btn4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        window.add(btn5, gbc);
    }

    public static void main(String[] args) {
        new GridBagLayoutTest();
    }
}
