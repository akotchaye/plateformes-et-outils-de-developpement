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
public class OracleDb implements Database{
    
    @Override
    public void connecter(){
        System.out.println("nouvelle connexion Oracle");
    }
    
    @Override
    public void deconnecter(){
        System.out.println("nouvelle deconnexion Oracle");
    }
}
