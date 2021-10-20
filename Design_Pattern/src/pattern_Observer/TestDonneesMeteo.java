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
public class TestDonneesMeteo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DonneesMeteo dm=new DonneesMeteo();
        /*AffichageConditions ac=new AffichageConditions(dm);*/
        dm.setMesures(22,65,1020);
        dm.setMesures(25,75,1000);
        dm.setMesures(23,30,1800);
        
    }
    
}
