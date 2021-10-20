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
public class Voiture implements Ivoiture{
   
    @Override 
    public void consommation(){
        System.out.println("je consomme de l'essence");
    }

    @Override
    public void deplacement() {
        System.out.println("je roule"); 
    }

    @Override
    public void moteur() {
        System.out.println("j'ai un moteur a essence"); 
    }
    
}
