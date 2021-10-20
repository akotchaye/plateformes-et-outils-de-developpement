/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tri;

/**
 *
 * @author Harbit
 */
public class GestionnaireTri {
    
    private void faireTriInsertion(Trieuse t){
        t.tri();
        
    }
    
     private void faireTriFusion(Trieuse t){
        t.tri();
        
    }
     
    public void tri(Trieuse t){ 
        
        if (t.typeTri == TypeTri.TriFusion ){
            faireTriFusion(t);
    }
        else if (t.typeTri == TypeTri.TriInsertion){
            faireTriInsertion(t);
    }
}
}
