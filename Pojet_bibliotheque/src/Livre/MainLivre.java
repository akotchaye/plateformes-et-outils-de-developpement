/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livre;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainLivre {
    
    public static void main (String[]args){
    Scanner clavier =new Scanner(System.in);
    
    System.out.println("Entrer l'auteur du livre");
    String auteur=clavier.nextLine();
    System.out.println("Entrer le titre du livre");
    String titre=clavier.nextLine();
    
    System.out.println("Entrer le nombre de page du livre");
    int nbPages=clavier.nextInt();
    
    LivrePersistant LP= new LivrePersistant();
    LP.enregistrer(auteur,nbPages,titre);
    System.out.println("l'auteur est "+ auteur+"le nombre de pages est:"+nbPages+"le titre est"+titre);
    }
}
