/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.collection;

import entities.Person;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import static java.util.List.of;
import java.util.Set;

/**
 *
 * @author Elisa Bothy
 */
public class MainSet {
    public static void main(String[]args){
        Set<Person> persons = new HashSet<>();
        Person alf = new Person ("Danlta", "Alphonse", LocalDate.of(2000, 06, 5));
        Person sof = new Person ("Stule", "Sophie", LocalDate.of(2002, 03, 12));
        Person toto = new Person ("Danlta", "Alphonse", LocalDate.of(2000, 06, 5));

        persons.add(alf);
        persons.add(sof);
        System.out.println("persons = " + persons);
        persons.add(toto);
        for(Person p : persons){
            System.out.println("p = " + p);
        }
    }
}
