/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRP;

/**
 *
 * @author Harbit
 */
public class DIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Gestionnairedb db = new Gestionnairedb();
        
        db.connecter();
        db.deconnecter();
       
    }
    
}