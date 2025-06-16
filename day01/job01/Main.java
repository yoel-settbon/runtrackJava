package day01.job01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir quelque chose
        System.out.print("Veuillez saisir un texte : ");
        String saisie = scanner.nextLine();  // Lit une ligne de texte

        // Affiche ce que l'utilisateur a saisi
        System.out.println("Vous avez saisi : " + saisie);

        // Fermer le scanner (bonne pratique)
        scanner.close();
    }
}
