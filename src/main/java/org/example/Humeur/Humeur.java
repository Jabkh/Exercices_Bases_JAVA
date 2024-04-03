package org.example.Humeur;

import java.util.Scanner;

public class Humeur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de décrire son humeur
        System.out.println("Comment vous sentez-vous aujourd'hui ? Décrivez votre humeur en un mot : ");
        String humeur = scanner.nextLine().toLowerCase();

        // Suggérer une activité en fonction de l'humeur
        switch (humeur) {
            case "joyeux":
                System.out.println("Pourquoi ne pas passer la journée à faire du sport ou à voir des amis ?");
                break;
            case "triste":
                System.out.println("Pour vous remonter le moral, vous pourriez regarder votre film préféré ou lire un livre réconfortant.");
                break;
            case "aventurier":
                System.out.println("Partez à l'aventure ! Essayez une nouvelle activité, explorez un nouvel endroit ou faites une randonnée dans la nature.");
                break;
            default:
                System.out.println("Quelle que soit votre humeur, prenez du temps pour vous et faites quelque chose qui vous fait du bien !");
        }

        scanner.close();
    }
}
