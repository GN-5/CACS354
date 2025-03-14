package StudentMVCApp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class StudentListView extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;

    public StudentListView() {
        setTitle("Student List");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // buttons
        addButton = new JButton("Add Student");
        editButton = new JButton("Edit Student");
        deleteButton = new JButton("Delete Student");

        tableModel = new DefaultTableModel(new Object[] { "Roll Number", "Name", "Email" }, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void refreshTable(List<StudentMVCApp.StudentModel.Student> students) {
        tableModel.setRowCount(0); // Clear existing rows
        for (StudentMVCApp.StudentModel.Student s : students) {
            tableModel.addRow(new Object[] { s.getRollNumber(), s.getName(), s.getEmail() });
        }
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JTable getTable() {
        return table;
    }
}
