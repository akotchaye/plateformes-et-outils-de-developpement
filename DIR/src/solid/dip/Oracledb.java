/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.dip;

/**
 *
 * @author Harbit
 */
public class Oracledb implements Database{

    @Override
    public void connecter() {
         System.out.print("Connexion a la Base de donnee Oracle ");
    }

    @Override
    public void deconnecter() {
       System.out.print("Deconnexion de la  Base de donnee Oracle ");
    }
    
}
