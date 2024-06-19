import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        String choice = null;

        do {
            System.out.println("Welcome to Temperature Converter");
            System.out.println("1. Celcius to Farenheit"); // => F = (9/5)C + 32
            System.out.println("2. Farenheit to Celcius"); // => C = (F - 32) × 5/9
            System.out.println("3. Exit");

            Scanner in = new Scanner(System.in);

            // Take input from the user
            System.out.print("Enter the option:");
            int option = in.nextInt();

            switch (option) {
                case 1:
                    // Option 1: Take temperature in Celcius and convert to Farenheit and show the output
                    double tempInCelcius = readTemperature(in);
                   celciusToFarenheit(tempInCelcius);
                    break;
                case 2:
                    // Option 2: Take temperature in Farenheit and convert to Celcius and show the output
                    double tempInFarenheit = readTemperature(in);
                    farenheitToCelcius(tempInFarenheit);
                    break;
                case 3:
                    // Option 3: Thank You!!!
                    System.out.println("Thank You!!!");
//                return;
                    System.exit(0);
                default:
                    System.out.println("Invalid Option. Please try again");
            }

            System.out.print("Do you want to continue? (Yes/No) ");
            choice = in.next();

        }while(choice.equals("Yes")) ;

    }

    public static void celciusToFarenheit(double tempInCelcius) {
        double tempInFarenheit = (tempInCelcius * 9 / 5) + 32;
        System.out.println("Temperature in Farenheit: " + tempInFarenheit);
    }

    public static void farenheitToCelcius(double tempInFarenheit) {
        double tempInCelcius = (tempInFarenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celcius: " + tempInCelcius);
    }

    public static double readTemperature(Scanner in) {
        System.out.print("Enter the temperature: ");
        return in.nextDouble();
    }

}
