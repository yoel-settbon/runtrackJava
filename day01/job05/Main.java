package day01.job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des 3 nombres
        System.out.print("Entrez le premier nombre : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int b = scanner.nextInt();

        System.out.print("Entrez le troisième nombre : ");
        int c = scanner.nextInt();

        // Calcul du maximum des trois
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        // Affichage
        System.out.println("Le plus grand des trois nombres est : " + max);

        scanner.close();
    }
}
