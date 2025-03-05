package EventHandling;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenerTest extends JFrame implements ActionListener {

    JTextField jTFName = new JTextField(8);
    JButton jBtnSubmit = new JButton("Submit");
    JButton jBtnDelete = new JButton("Delete");

    public ActionListenerTest() {
        jBtnSubmit.addActionListener(this);
        jBtnDelete.addActionListener(this);
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
        window.add(jBtnDelete);
    }

    public static void main(String[] args) {
        new ActionListenerTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Delete")) {
            int confirm = JOptionPane.showConfirmDialog(jBtnDelete, "Do you want to delete?");
            System.out.println(confirm);
        } else {
            JOptionPane.showMessageDialog(jBtnDelete, "Deleted");
        }
        String input = JOptionPane.showInputDialog("Enter a Number ");
        System.out.println(input);
    }
}