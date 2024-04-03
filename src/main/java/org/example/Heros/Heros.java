package org.example.Heros;

import java.util.Scanner;

public class Heros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de choisir entre force, intelligence ou vitesse
        System.out.println("Quelle caractéristique vous attire le plus chez un super-héros ?");
        System.out.println("Choisissez entre 'force', 'intelligence' ou 'vitesse' : ");
        String choix = scanner.nextLine().toLowerCase();

        // Recommender un super-héros en fonction du choix de l'utilisateur
        switch (choix) {
            case "force":
                System.out.println("Nous vous recommandons Hulk !");
                System.out.println("Avec sa force surhumaine, Hulk est capable de soulever des montagnes et de vaincre n'importe quel adversaire.");
                break;
            case "intelligence":
                System.out.println("Nous vous recommandons Iron Man !");
                System.out.println("Grâce à son intelligence hors du commun, Iron Man a créé une armure technologiquement avancée qui lui confère une force surhumaine et des capacités de vol.");
                break;
            case "vitesse":
                System.out.println("Nous vous recommandons Flash !");
                System.out.println("Avec sa vitesse incroyable, Flash peut se déplacer à des vitesses supersoniques, ce qui lui permet de sauver des vies et de combattre le crime en un éclair.");
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir entre 'force', 'intelligence' ou 'vitesse'.");
        }

        scanner.close();
    }
}

