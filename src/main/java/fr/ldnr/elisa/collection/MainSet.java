/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.collection;

import entities.Person;
import enums.Sex;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Elisa Bothy
 */
public class MainSet {
    public static void main(String[]args){
        Set<Person> persons = new HashSet<>();
        Person alf = new Person ("Danlta", "Alphonse", LocalDate.of(2000, 06, 5), Sex.MALE);
        Person sof = new Person ("Stule", "Sophie", LocalDate.of(2002, 03, 12), Sex.FEMALE);
        Person toto = new Person ("Danlta", "Alphonse", LocalDate.of(2000, 06, 5), Sex.OTHER);

        persons.add(alf);
        persons.add(sof);
        System.out.println("persons = " + persons);
        persons.add(toto);
        for(Person p : persons){
            System.out.println("p = " + p);
        }
    }
}
