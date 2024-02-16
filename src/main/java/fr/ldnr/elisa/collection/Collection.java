/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.ldnr.elisa.collection;

import entities.Car;
import entities.Garage;
import java.awt.Color;

/**
 *
 * @author Elisa Bothy
 */
public class Collection {

    public static void main(String[] args) {
        Car car = new Car("Alpha", Color.yellow, 150);
        Garage garage = new Garage("Harry");
        garage.add(car);
        System.out.println("garage = " + garage);
        Car scenic = new Car("Scenic", Color.gray, 50);
        Car porshe = new Car("Porshe", Color.red, 500);
        Car cocci = new Car("Coccinelle", Color.red, 50);
        garage.add(scenic);
        garage.add(porshe);
        garage.add(cocci);
        System.out.println(garage + "garage = ");
        garage.forEach(c -> {
            System.out.println(c);
        });
    }
}
