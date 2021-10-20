/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.ocp;

import tri.*;

/**
 *
 * @author Harbit
 */
public class TriFusion extends Trieuse{

    @Override
    protected void tri() {
        System.out.println("Tri par Fusion"); 
    }
    
    public TriFusion(){
        super.typeTri = TypeTri.TriFusion;
        
    }
    
    
    
    
    
}
