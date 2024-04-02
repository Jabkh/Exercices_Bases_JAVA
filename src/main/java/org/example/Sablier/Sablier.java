package org.example.Sablier;

import java.util.Scanner;

public class Sablier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enregistrer le temps de début
        long startTime = System.currentTimeMillis();

        // Enregistrer le temps de fin
        long endTime = System.currentTimeMillis();

        // Calculer le temps écoulé en millisecondes
        long elapsedTime = endTime - startTime;

        // Convertir le temps écoulé en secondes
        double elapsedSeconds = elapsedTime / 1000.0;

        // Demander à l'utilisateur de taper un message
        System.out.println("Tapez un message et appuyez sur Entrée pour commencer le chronomètre :");
        String message = scanner.nextLine();

        // Demander à l'utilisateur de taper un deuxième message
        System.out.println("Tapez un deuxième message et appuyez sur Entrée pour arrêter le chronomètre :");
        message = scanner.nextLine();


        // Afficher le temps écoulé
        System.out.println("""
                Temps écoulé entre les deux messages : 
                 %f secondes.""".formatted(elapsedSeconds));


        scanner.close();
    }
}
