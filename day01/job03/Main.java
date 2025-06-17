package day01.job03;

public class Main {
    public static void main(String[] args) {
        // Création et initialisation du tableau
        int[] T = new int[10];  // tableau de 10 cases (indices 0 à 9)

        // Remplissage du tableau avec les valeurs 0 à 9
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }

        // Affichage des valeurs demandées
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);

        // Accès à T[10] provoque une erreur
        System.out.println("T[10] = " + T[10]);  // 🚨 ERREUR !
    }
}
