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
public class Gestionnairedb {
    
   private MySqlDb db;
   
   public void connecter(){
       db.connecter();
   }
   
    public void deconnecter (){
       db.deconnecter();
   }
    
   public Gestionnairedb(){
       this.db = new MySqlDb();
   }
}
