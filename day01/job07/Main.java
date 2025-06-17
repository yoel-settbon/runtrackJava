package day01.job07;

public class Main {
    public static void main(String[] args) {
        int somme = 0;

        for (int i = 1; i <= 100; i++) {
            somme += i;  // équivalent à somme = somme + i
        }

        System.out.println("La somme des 100 premiers entiers est : " + somme);
    }
}
