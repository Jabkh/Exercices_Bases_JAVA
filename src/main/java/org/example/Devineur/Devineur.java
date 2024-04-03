package org.example.Devineur;

import java.util.Scanner;

public class Devineur {
        System.out.println("Pensez à un animal et répondez aux questions suivantes par oui ou non :");
        System.out.print("Est-ce que l'animal vit dans l'eau ? ");
    String reponse = scanner.nextLine().toLowerCase();

    // Première supposition
        if (reponse.equals("oui")) {
        System.out.println("Est-ce que c'est un poisson ?");
    } else if (reponse.equals("non")) {
        System.out.println("Est-ce que c'est un animal terrestre ?");
    } else {
        System.out.println("Réponse non valide.");
        return;
    }

    // Réponse à la première supposition
        System.out.print("Votre réponse : ");
    reponse = scanner.nextLine().toLowerCase();

    // Deuxième supposition en fonction de la réponse à la première
        if (reponse.equals("oui")) {
        System.out.println("Vous pensez à un poisson !");
    } else if (reponse.equals("non")) {
        System.out.println("Ah mais oui! Un Oiseau c'est ça ?");
    } else {
        System.out.println("Réponse non valide.");
    }

}
