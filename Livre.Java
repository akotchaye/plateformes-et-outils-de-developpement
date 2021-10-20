public class Livre implements ILivreHandler{
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
        livrePersistant=new LivrePersistant();
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
@override
public String ToString(){
    return titre +":"+ auteur +"-"+nbPages;
}

public String Imprimer(){
    System.out.println("Impression du livre xxx en cours ...");
}

public String Enregistrer(){
    System.out.println("Enregistrement du livre xxx en cours...")
}

}