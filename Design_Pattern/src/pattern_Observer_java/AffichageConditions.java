/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_Observer_java;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author User
 */
public class AffichageConditions implements Observer,Affichage {
Observable sujet;
private float temperature;
private float humidite;
public AffichageConditions(Observable obs){
this.sujet=obs;
sujet.addObserver(this);
}
   
public void update(Observable obs, Object arg) {
 if(obs instanceof DonneesMeteo){
 DonneesMeteo dm=(DonneesMeteo)obs;
 this.temperature=dm.getTemperature();
 this.humidite=dm.getHumidite();
 afficher();
}
}
public void afficher() {
System.out.println("Conditions actuelles:"+
temperature+" degès et "+humidite+" % d'hmidité");
}
}
