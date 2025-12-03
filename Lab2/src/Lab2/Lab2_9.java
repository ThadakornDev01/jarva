package Lab2;
import java.util.Scanner;
public class Lab2_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String mode = scanner.nextLine();
        double temperature = scanner.nextDouble();

        if (mode.equals("C_TO_F")) {
            double result = TempConverter.celsiusToFahrenheit(temperature);
            System.out.println(result);
        } else if (mode.equals("F_TO_C")) {
            double result = TempConverter.fahrenheitToCelsius(temperature);
            System.out.println(result);
        }

        scanner.close();
	}

}

class TempConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}