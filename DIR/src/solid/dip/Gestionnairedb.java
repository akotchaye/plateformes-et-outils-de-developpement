/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.dip;

import java.util.Scanner;

/**
 *
 * @author Harbit
 */
public class Gestionnairedb {
    private Database db;
    
    public Gestionnairedb(Database db){ 
        this.db = db;
    }
    
    public void connecter(){
       db.connecter();
    }
    
    
    public void deconnecter(){
        db.deconnecter();
    }
 
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Connexion Oracle");
        System.out.println("2 : Connexion MySQL");
        System.out.print("Veuillez choisr le type de connexion : ");
        int tri;
        tri = sc.nextInt();
        System.out.print("\n");
        switch (tri) {

            case 1:
                Gestionnairedb db  = new Gestionnairedb(new Oracledb());
                db.connecter();
                break;
            case 2:
                Gestionnairedb db1  = new Gestionnairedb(new Mysqldb());
                db1.connecter();
                break;
         
            default:
                System.out.println("Choix Incorect..........");
        }
       
    }
    
}
