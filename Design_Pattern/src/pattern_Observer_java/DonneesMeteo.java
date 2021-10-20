/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_Observer_java;
import java.util.Observable;
/**
 *
 * @author User
 */
public class DonneesMeteo extends Observable {
  private float temperature;
  private float humidite;
  private float pression;

public DonneesMeteo(){}
  public float getHumidite() {
  return humidite;
 }
   
public void actualiserMesures(){
  setChanged();
  notifyObservers();
}

public void setMesures(float t, float h, float p) {
  this.temperature=t;
  this.humidite=h;
  this.pression=p;
  actualiserMesures();
 }

public float getPression() {
  return pression;
}
public float getTemperature() {
  return temperature;
 }
}