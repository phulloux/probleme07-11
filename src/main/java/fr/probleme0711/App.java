package fr.probleme0711;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("combien d'article voulez vous ?");
        int nbrArtivle = clavier.nextInt();
        double prixTotal = 0;

        for(int i = 1;i<=nbrArtivle; i++){
            System.out.print("prix de larticle "+i+ " : ");
            Double prixarticle = clavier.nextDouble();
            prixTotal = prixTotal + prixarticle;
        }

        System.out.println("votre total est de : "+ prixTotal);
    }
    
}
