/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Montri;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //mon exemple 
      ITrieuse instance1 = new TriFusion();
      instance1.tri();
       ITrieuse instance2 = new TriInsertion();
      instance2.tri();
    }
    
}
