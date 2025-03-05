package MVCApp;

public class TempConverterModel {

    public float kelvinToCelsius(float kelvin) {
        return kelvin - 273.15f;
    }

    public float celsiusToKelvin(float celsius) {
        return celsius + 273.15f;
    }

    public float celsiusToFahrenheit(float celsius) {
        return celsius * 9 / 5 + 32;
    }

    public float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public float fahrenheitToKelvin(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15f;
    }

    public float kelvinToFahrenheit(float kelvin) {
        return (kelvin - 273.15f) * 9 / 5 + 32;
    }
}
