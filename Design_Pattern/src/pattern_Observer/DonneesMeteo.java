/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_Observer;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public  class DonneesMeteo implements Sujet {
    private float temperature;
    private float humidite;
    private float pression;
    private ArrayList observateurs;
    
    public DonneesMeteo(){
        observateurs=new ArrayList();
    }
    
    public void enregistrerObservateur(Observateur obs){
        observateurs.add(obs);
    }
    
    public void supprimerObservateur(Observateur obs){
        int i=observateurs.indexOf(obs);
        if(i>=0){
            observateurs.remove(i);
        }
    }
    
    public void notifierObservateurs() {
      for(int i=0;i<observateurs.size();i++){
      Observateur o=(Observateur)observateurs.get(i);
       o.actualiser(temperature,humidite,pression);
   }
   }
   public void setMesures(float t, float h, float p)
  {
   this.temperature=t;
   this.humidite=h;
   this.pression=p;
   actualiserMesures();
  }
  public void actualiserMesures() {
  notifierObservateurs();
  }
}
