/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_Observer;

/**
 *
 * @author User
 */
public class AffichageConditions implements Observateur,Affichage {
    
private float temperature;
private float humidite;
private Sujet donneesMeteo;

  public AffichageConditions(Sujet dm){
   this.donneesMeteo=dm;
   donneesMeteo.enregistrerObservateur(this);
   }
  
   public void afficher() {
    System.out.println("Conditions actuelles:"+
     temperature+" degès et "+humidite+" %d'hmidité");
   }
   
   public void actualiser(float t, float h, float p) {
    this.temperature=t;
    this.humidite=h;
    afficher();
   }
  }
