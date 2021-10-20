/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.controller;

import tp.model.Database;
import tp.view.FramePerson;

/**
 *
 * @author Harbit
 */
public class Controller {
    private Database database;
    private FramePerson person;

    public Controller(FramePerson person) {
        this.person = person;
        this.database = new Database();
    }
    
    
}
