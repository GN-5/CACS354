package Shapes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawExample extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    DrawExample() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        prepareGUI();
        setVisible(true);
    }

    private void prepareGUI() {
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        paper.drawLine(0, 0, 500, 500);
        paper.drawRect(100, 100, 50, 50);
        paper.drawOval(200, 200, 50, 50);
        paper.setColor(Color.red);
        paper.fillRect(100, 100, 50, 50);
        paper.fillOval(200, 200, 50, 50);

    }

    public static void main(String[] args) {
        new DrawExample();
    }

}
