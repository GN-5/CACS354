package AddressBook;

import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
    ImageIcon icon = new ImageIcon(".imgs/save.png");
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");

    BorderLayoutTest() {
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
        window.setLayout(new BorderLayout(20, 20));

        btn1.setFont(new Font("Arial", Font.BOLD, 20));
        window.add(btn1, BorderLayout.EAST);
        window.add(btn2, BorderLayout.NORTH);
        window.add(btn3, BorderLayout.SOUTH);
        window.add(btn4, BorderLayout.WEST);
        window.add(btn5, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
