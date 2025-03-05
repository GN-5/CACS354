package MVCApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TempConverterController implements ActionListener {

    TempConverterView view;
    TempConverterModel model;

    public TempConverterController() {
        view = new TempConverterView();
        model = new TempConverterModel();
        view.convertButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String inputText = view.inputField.getText();
            float inputTemp = Float.parseFloat(inputText);
            String conversionType = (String) view.conversionComboBox.getSelectedItem();
            float result = 0.0f;

            switch (conversionType) {
                case "Kelvin to Celsius":
                    result = model.kelvinToCelsius(inputTemp);
                    break;
                case "Celsius to Kelvin":
                    result = model.celsiusToKelvin(inputTemp);
                    break;
                case "Celsius to Fahrenheit":
                    result = model.celsiusToFahrenheit(inputTemp);
                    break;
                case "Fahrenheit to Celsius":
                    result = model.fahrenheitToCelsius(inputTemp);
                    break;
                case "Fahrenheit to Kelvin":
                    result = model.fahrenheitToKelvin(inputTemp);
                    break;
                case "Kelvin to Fahrenheit":
                    result = model.kelvinToFahrenheit(inputTemp);
                    break;
                default:
                    JOptionPane.showMessageDialog(view, "Unknown conversion type selected.");
                    return;
            }
            // Display the conversion result in the output text field.
            view.outputField.setText(String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new TempConverterController();
    }
}
