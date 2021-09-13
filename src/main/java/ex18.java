import java.util.Scanner;

/*
    UCF COP3330 Fall 2021 Assignment 18 Solution
    Copyright 2021 Luke Faulkner
 */
public class ex18 {
    public static void main(String[] args) {

        // Variables
        String inputTemp, fullTempName, convertedTempName;
        int currentTemp, convertedTemp;
        Scanner tempCheck = new Scanner(System.in);

        // Prompt
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        inputTemp = tempCheck.nextLine();
        System.out.println("Your choice: " + inputTemp);

        // Prompt with full temperature name
        convertedTempName = (inputTemp.equals("C") || inputTemp.equals("c")) ? "Celsius" : "Fahrenheit";
        fullTempName = (inputTemp.equals("C") || inputTemp.equals("c")) ? "Fahrenheit" : "Celsius";
        System.out.print("Please enter the temperature in " + fullTempName + " ");
        currentTemp = tempCheck.nextInt();

        // Calc + Output
        if (fullTempName.equals("Fahrenheit")) {
            convertedTemp = (currentTemp - 32) * 5 / 9;
        } else {
            convertedTemp = (currentTemp * 9 / 5) + 32;
        }

        // Output
        System.out.print("The temperature in " + convertedTempName + " is " + convertedTemp);
    }
}
