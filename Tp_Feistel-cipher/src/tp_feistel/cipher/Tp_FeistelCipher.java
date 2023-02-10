package tp_feistel.cipher;

import java.util.Scanner;

/**
 *
 * @author catsr
 */
public class Tp_FeistelCipher {
    public static void main(String[] args) {
        //Ici c'est l'insertion de N de 8 bits 
        int tableauDeDonnees[] = new int[8];
        Scanner clavier1 = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Veuillez saisir le BIT à la position " + i + ":");
            tableauDeDonnees[i] = clavier1.nextInt();
        }
        //Ici c'est l'Affichage des données de la clé N 
        System.out.print("N = ");
        for (int i = 0; i < 8; i++) {
            System.out.print(tableauDeDonnees[i] + "|");
        }
        System.out.println("");

        // Ici, nous appliquons la permutation π 
        System.out.println("----------------------------");
        int pi[] = new int[8];
        for (int w = 0; w < 8; w++) {
            System.out.print("La valeur de permutation position " + w + ":");
            pi[w] = clavier1.nextInt();
        }
    }
    
}
