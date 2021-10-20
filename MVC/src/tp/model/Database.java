/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harbit
 */
public class Database {
    private List<Person> listPerson;

    public Database(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public void addPerson(Person p) {
        listPerson.add(p);
    }

    public void deletePerson(Person p) {
        listPerson.remove(p);
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public Database() {
        listPerson = new ArrayList<>();
    }

}
