/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voiture;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ivoiture voiture = new Voiture();
        Ivoiture voitureE= new VoitureElectrique();
        System.out.println("Ma voiture ");
        voiture.consommation();
        voiture.deplacement();
        voiture.moteur();
        System.out.println("Ma voiture electrique");
        voitureE.consommation();
        voitureE.deplacement();
        voitureE.moteur();
    }
    
}
