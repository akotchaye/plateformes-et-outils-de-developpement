/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_strategie;

/**
 *
 * @author User
 */
public class Employe {
     private String cin;
     private float salaireBrutMensuel;
     public Employe (String cin,float sBM){
         this.cin=cin;
         this.salaireBrutMensuel=sBM;
     }
     public float calculerIGR(){
         float sba=salaireBrutMensuel*12;
         float taux=42;
         return sba*taux/100;
     }
     public float getSalaireNetMensuel(){
         float igr=calculerIGR();
         float sna=salaireBrutMensuel*12-igr;
         return sna/12;
         
     }
}
