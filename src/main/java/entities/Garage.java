/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elisa Bothy
 */
public class Garage {
   private List<Car> cars;

    public Garage(){
        this.cars = new ArrayList<>();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Garage{");
        sb.append("cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
