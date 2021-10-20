/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_Observer;

/**
 *
 * @author User
 */
public interface Sujet {
    void  enregistrerObservateur(Observateur obs);
    void  supprimerObservateur(Observateur obs);
    void  notifierObservateurs();
}
 
