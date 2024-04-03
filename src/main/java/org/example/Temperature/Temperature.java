package org.example.Temperature;

import java.util.Scanner;
public class Temperature {

    // Méthode pour convertir Celsius en Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la température et l'unité de mesure
        System.out.print("Entrez la température : ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); // Consommer le saut de ligne

        System.out.print("Entrez l'unité de mesure (C pour Celsius, F pour Fahrenheit) : ");
        String unit = scanner.nextLine().toUpperCase();

        // Convertir la température en fonction de l'unité spécifiée
        double result;
        if (unit.equals("C")) {
            result = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " degrés Celsius équivalent à " + result + " degrés Fahrenheit.");
        } else if (unit.equals("F")) {
            result = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " degrés Fahrenheit équivalent à " + result + " degrés Celsius.");
        } else {
            System.out.println("Unité de mesure non valide. Veuillez entrer C pour Celsius ou F pour Fahrenheit.");
        }

        scanner.close();
    }


}

