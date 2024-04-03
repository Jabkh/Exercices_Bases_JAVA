package org.example.Dilemme;

import java.util.Scanner;

public class Dilemme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Vous cherchez une boulangerie avec les meilleures viennoiseries du secteur\n");

        // Question
        System.out.println("Partir vers Lille pour gouter leurs fameux chaussons aux pommes ? choix 1\n ");
        System.out.println("Prendre la décision d'aller vers Flers pour enfin voir si leurs croissants valent le détour ? choix 2\n");
        System.out.print("Ou simplement ramener les bons vieux petits pains au chocolat de la boulangerie d'à coté ? choix 3\n");

        // Lire le choix de l'utilisateur
        int choix = scanner.nextInt();

        // Structure Conditionnelle
        switch (choix) {
            case 1:
                // Choix 1
                System.out.println("Vous décider d'aller à Lille,il se trouve que ces chaussons aux pommes se sont révélés1 encore meilleurs");
                System.out.println("la boîte de petits pouchains comme ils l'appellent était surprenante agréable découverte.");
                break;
            case 2:
                // Choix 2
                System.out.println("Vous partez vers Flers décidé de savoir si une bonne fois pour toutes ces croissants");
                System.out.println("dont vous avez entendu parler sont si bons qu'ils le prétendent");
                System.out.println("Il s'avère que oui, leurs croissants sont délicieux toute la famille était ravie.");
                break;
            case 3:
                // Choix 3
                System.out.println("Vous avez finalement pris la décision d'aller à la boulangerie d'à coté");
                System.out.println("Celle où vous savez à quoi à vous attendre satisfait de vos petites habitudes");
                System.out.println("Excellente manière de commencer cette journée.");
                break;
            default:
                // Choix invalide
                System.out.println("Vous avez oublié vos clés allez les chercher");
        }

        scanner.close();
    }
}