package CalculatorMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        this.view.addCalculateListener(new CalculateListener());
        this.view.addCloseListener(new CloseListener());
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNum = view.getFirstNumber();
                double secondNum = view.getSecondNumber();
                double result = 0;

                if (view.isAddSelected()) {
                    result = model.add(firstNum, secondNum);
                } else if (view.isSubSelected()) {
                    result = model.sub(firstNum, secondNum);
                } else if (view.isMulSelected()) {
                    result = model.mul(firstNum, secondNum);
                } else if (view.isDivSelected()) {
                    result = model.div(firstNum, secondNum);
                }

                view.displayResult(result);
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter valid numbers.");
            }
        }
    }

    class CloseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        new CalculatorController(view, model);

        view.setVisible(true);
    }
}
