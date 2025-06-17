package day01.job04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création du scanner
        Scanner scanner = new Scanner(System.in);

        // Demander un nombre à l'utilisateur
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();  // Lecture d'un entier

        // Calcul du carré
        int carre = nombre * nombre;

        // Affichage du résultat
        System.out.println("Le carré de " + nombre + " est " + carre);

        // Fermeture du scanner
        scanner.close();
    }
}
