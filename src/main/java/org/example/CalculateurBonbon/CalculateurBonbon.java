package org.example.CalculateurBonbon;

import java.util.Scanner;
public class CalculateurBonbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre de bonbons et le prix par bonbon
        System.out.print("Entrez le nombre de bonbons que vous souhaitez acheter : ");
        int numberOfCandies = scanner.nextInt();

        System.out.print("Entrez le prix par bonbon : ");
        double pricePerCandy = scanner.nextDouble();

        // Calculer le coût total d'achat de bonbons
        double totalCost = numberOfCandies * pricePerCandy;

        // Afficher le coût total d'achat de bonbons
        System.out.println("Le coût total d'achat de bonbons est : " + totalCost + " euros.");

        scanner.close();
    }
}

