package org.example.Comparateur;

import java.util.Scanner;

public class Comparateur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre
        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();

        // Vérifie si le nombre est positif ou négatif
        if (nombre != 0) {
            String message = (nombre > 0) ? "Le nombre est positif." : "Le nombre est négatif.";
            System.out.println(message);
        } else {
            System.out.println("Le nombre est égal à zéro.");
        }

        scanner.close();
    }
}

