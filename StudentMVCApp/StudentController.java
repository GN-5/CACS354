package StudentMVCApp;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class StudentController {
    private StudentModel model;
    private StudentListView listView;

    public StudentController(StudentModel model, StudentListView listView) {
        this.model = model;
        this.listView = listView;

        // Initialize the table with data from the database
        refreshStudentTable();

        // Listener for the "Add Student" button
        listView.getAddButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openAddStudentDialog();
            }
        });

        // Listener for the "Edit Student" button
        listView.getEditButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editSelectedStudent();
            }
        });

        // Listener for the "Delete Student" button
        listView.getDeleteButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteSelectedStudent();
            }
        });
    }

    // Refreshes the list view's table data
    private void refreshStudentTable() {
        List<StudentModel.Student> students = model.getAllStudents();
        listView.refreshTable(students);
    }

    // Opens the Add/Edit dialog for adding a new student
    private void openAddStudentDialog() {
        StudentAddView addView = new StudentAddView(listView);
        addView.getSaveButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = addView.getStudentName();
                String email = addView.getStudentEmail();
                // If studentId is -1, add a new student; otherwise, update existing record
                if (addView.getStudentId() == -1) {
                    boolean success = model.addStudent(name, email);
                    if (success) {
                        JOptionPane.showMessageDialog(addView, "Student added successfully!");
                    } else {
                        JOptionPane.showMessageDialog(addView, "Error adding student.");
                    }
                } else {
                    boolean success = model.updateStudent(addView.getStudentId(), name, email);
                    if (success) {
                        JOptionPane.showMessageDialog(addView, "Student updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(addView, "Error updating student.");
                    }
                }
                addView.dispose();
                refreshStudentTable();
            }
        });
        addView.setVisible(true);
    }

    // Opens the dialog pre-populated for editing the selected student
    private void editSelectedStudent() {
        int selectedRow = listView.getTable().getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(listView, "Please select a student to edit.");
            return;
        }
        int studentId = (int) listView.getTable().getValueAt(selectedRow, 0);
        String name = (String) listView.getTable().getValueAt(selectedRow, 1);
        String email = (String) listView.getTable().getValueAt(selectedRow, 2);

        StudentAddView addView = new StudentAddView(listView);
        addView.setStudentData(studentId, name, email);
        addView.getSaveButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String updatedName = addView.getStudentName();
                String updatedEmail = addView.getStudentEmail();
                boolean success = model.updateStudent(studentId, updatedName, updatedEmail);
                if (success) {
                    JOptionPane.showMessageDialog(addView, "Student updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(addView, "Error updating student.");
                }
                addView.dispose();
                refreshStudentTable();
            }
        });
        addView.setVisible(true);
    }

    // Deletes the selected student after confirmation
    private void deleteSelectedStudent() {
        int selectedRow = listView.getTable().getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(listView, "Please select a student to delete.");
            return;
        }
        int studentId = (int) listView.getTable().getValueAt(selectedRow, 0);
        int confirm = JOptionPane.showConfirmDialog(listView, "Are you sure you want to delete this student?",
                "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = model.deleteStudent(studentId);
            if (success) {
                JOptionPane.showMessageDialog(listView, "Student deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(listView, "Error deleting student.");
            }
            refreshStudentTable();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentModel model = new StudentModel();
                StudentListView listView = new StudentListView();
                new StudentController(model, listView);
                listView.setVisible(true);
            }
        });
    }
}
