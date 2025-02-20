package EventHandling;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ActionListenerTest extends JFrame implements ActionListener {

    JTextField jTFName = new JTextField(8);
    JButton jBtnSubmit = new JButton("Submit");
    JButton jBtnSave = new JButton("Save");

    public ActionListenerTest() {
        jBtnSubmit.addActionListener(this);
        jBtnSave.addActionListener(this);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 300);
        prepareGUI();
        setVisible(true);
    }

    void prepareGUI() {
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.add(jTFName);
        window.add(jBtnSubmit);
        window.add(jBtnSave);
    }

    public static void main(String[] args) {
        new ActionListenerTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        System.out.println(jTFName.getText());
    }
}