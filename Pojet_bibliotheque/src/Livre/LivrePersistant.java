/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livre;
import java.sql.Connection;
import java.sql.Statement;
import Connexion.Connexion;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class LivrePersistant {
    
    private Livre livre;
    
    public LivrePersistant(){
        this.livre = new Livre();
    }
    
   public void enregistrer(String auteur, int nbPages, String titre) {
       try{
       String req = "insert into livre(auteur,nbPages,titre)"
               + " values('"+auteur+"','"+nbPages+"','"+titre +"')" ;
       Connexion con= new Connexion();
       Statement st = con.createStatement();
       st.executeUpdate(req);
       System.out.println("informations concernant le livre bien enregistrées");
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       
       
   } 
   public String imprimer(){
   return "Impression du livre" +" "+"en cours";
           }
    
    }
