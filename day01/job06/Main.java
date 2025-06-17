package day01.job06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somme = 0;  // Pour stocker la somme des 5 entiers

        for (int i = 1; i <= 5; i++) {
            System.out.print("Entrez le nombre " + i + " : ");
            int saisie = scanner.nextInt();  // Variable temporaire pour chaque saisie
            somme += saisie;  // On ajoute à la somme
        }

        double moyenne = somme / 5.0;  // Division flottante
        System.out.println("La moyenne est : " + moyenne);

        scanner.close();
    }
}
