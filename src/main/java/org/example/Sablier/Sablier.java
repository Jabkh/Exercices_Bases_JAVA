package org.example.Sablier;

import java.util.Scanner;

public class Sablier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long tempsDebut;


        long tempsFin;


        long tempsEcoule;


        double tempsEcouleSecondes;

        // Demande à l'utilisateur de taper un message
        System.out.println("Tapez un message et appuyez sur Entrée pour commencer le chronomètre :");
        String message = scanner.nextLine();

        // Enregistre le temps de début
        tempsDebut = System.currentTimeMillis();

        // Demander à l'utilisateur de taper un deuxième message
        System.out.println("Tapez un deuxième message et appuyez sur Entrée pour arrêter le chronomètre :");
        message = scanner.nextLine();

        // Enregistre le temps de fin
        tempsFin = System.currentTimeMillis();

        // Calcule le temps écoulé en millisecondes
        tempsEcoule = tempsFin - tempsDebut;

        // Convertit le temps écoulé en secondes
        tempsEcouleSecondes = tempsEcoule / 1000.0;

        // Afficher le temps écoulé
        System.out.println("""
                Temps écoulé entre les deux messages : 
                 %f secondes.""".formatted(tempsEcouleSecondes));

        scanner.close();
    }
}