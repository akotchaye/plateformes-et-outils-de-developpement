/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Connexion {
    String url = "jdbc:mysql://localhost:3306/bibliotheque";
String user = "root";
String passwd = "root";
   private Connection connection = null;
   
   public   Connexion(){
        try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Connexion au driver réussie!!!!!");

connection  = DriverManager.getConnection(url, user,passwd);
System.out.println("Connexion effective !");
} catch (Exception e) {
System.out.println("Erreur"+ e.getMessage());
    }
        }
   public Connection getConnexion(){
       return connection;
   }
    public static void main(String[] args) {
      System.out.println(new Connexion().getConnexion());
}

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
