/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livre;

/**
 *
 * @author User
 */
public class Livre {
    public class LivrePersistant{

    }
  private String auteur ;
    private String titre;
    private int    nbPages;

    public Livre (){

    } 
    public Livre (String auteur ,String titre,int nbPages ){
        this.auteur=auteur;
        this.titre=titre;
        this.nbPages=nbPages;
        LivrePersistant livrePersistant =new LivrePersistant();
    }

    public void SetAuteur(String auteur){
        this.auteur=auteur;
    }
     public void SetTitre(String titre){
        this.titre=titre;
    }
    public void SetNbPages(int nbPages){
        this.nbPages=nbPages;
    }
 public String GetAuteur(){
        return this.auteur;
    }
    public String GetTitre(){
        return this.titre;
    }
    public int GetNbPages(){
        return this.nbPages;
    }

 @Override
 public String toString(){
    return titre +":"+ auteur +"-"+nbPages;
}

public void imprimer(){
    System.out.println("Impression du livre xxx en cours ...");
}


}
