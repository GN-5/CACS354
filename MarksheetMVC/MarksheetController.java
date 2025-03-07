package MarksheetMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksheetController {

    private MarksheetView view;
    private MarksheetModel model;

    public MarksheetController(MarksheetView view, MarksheetModel model) {
        this.view = view;
        this.model = model;

        // listeners
        this.view.addGenerateListener(new GenerateListener());
        this.view.addCloseListener(new CloseListener());
    }

    class GenerateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double oot = view.getOOTMarks();
                double oop = view.getOOPMarks();
                double db = view.getDBMarks();

                double total = model.getTotal(oot, oop, db);
                double percentage = model.getPercentage(oot, oop, db);
                String division = model.getDivision(oot, oop, db);
                String result = model.getResult(oot, oop, db);

                // Update view
                view.setTotalMarks(total);
                view.setTotalPercentage(percentage);
                view.setDivision(division);
                view.setResult(result);

            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter valid marks (numbers only).");
            }
        }
    }

    // Inner class for the CLOSE button
    class CloseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        MarksheetView view = new MarksheetView();
        MarksheetModel model = new MarksheetModel();
        new MarksheetController(view, model);
        view.setVisible(true);
    }
}
