/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP;

/**
 *
 * @author User
 /*cette classe  ne sera  pas modifiée lorsqu'on ajoutera une nouvelle connexion*/
public class Gestionnairedb {
    
    private Database db;
    
    public Gestionnairedb(Database db){/*ce constructeur est le meme que l'ancien sauf
        que l'interface nous donne la possibilité de generalisé les classes MySqlDb et OracleDb*/
    this.db=db;
    }
    
    public void connecter(){
         db.connecter();
    }
     public void deconnecter(){
         db.deconnecter();
     }   
     
}
