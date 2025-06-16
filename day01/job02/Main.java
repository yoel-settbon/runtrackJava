package day01.job02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création du scanner pour lire au clavier
        Scanner scanner = new Scanner(System.in);

        // Demande de saisir le prénom
        System.out.print("Veuillez entrer votre prénom : ");
        String prenom = scanner.nextLine();

        // Affichage du message personnalisé
        System.out.println("Bonjour " + prenom);

        // Fermeture du scanner (bonne pratique)
        scanner.close();
    }
}

