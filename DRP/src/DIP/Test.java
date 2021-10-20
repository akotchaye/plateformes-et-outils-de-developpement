/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*la definition de gestionnaire a l'aide de l'interface 
        nous permet de creer un objet MySql ou 
        Oracle
        */
        Gestionnairedb dbM = new Gestionnairedb(new MySqlDb());
        Gestionnairedb dbO = new Gestionnairedb(new OracleDb());
        
        dbM.connecter();
        dbM.deconnecter();
        dbO.connecter();
        dbO.deconnecter();
        
        
    }
    
}
