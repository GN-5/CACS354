package StudentMVCApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAddView extends JDialog {
    private JTextField nameField;
    private JTextField emailField;
    private JButton saveButton;
    private JButton cancelButton;

    private int studentId = -1;

    public StudentAddView(JFrame parent) {
        super(parent, "Add/Edit Student", true);
        setSize(300, 200);
        setLocationRelativeTo(parent);
        initComponents();
    }

    private void initComponents() {
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        saveButton = new JButton("Save");
        cancelButton = new JButton("Cancel");

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(saveButton);
        panel.add(cancelButton);

        add(panel);

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public String getStudentName() {
        return nameField.getText();
    }

    public String getStudentEmail() {
        return emailField.getText();
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public void setStudentData(int id, String name, String email) {
        studentId = id;
        nameField.setText(name);
        emailField.setText(email);
    }
}
