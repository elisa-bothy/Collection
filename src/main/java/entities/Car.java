/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.awt.Color;

/**
 *
 * @author Elisa Bothy
 */
public class Car {
    private String brand;
    private Color color;
    private int power;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("brand=").append(brand);
        sb.append(", color=").append(color);
        sb.append(", power=").append(power);
        sb.append('}');
        return sb.toString();
    }

    public Car(String brand, Color color, int power) {
        this.brand = brand;
        this.color = color;
        this.setPower(power);
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public final void setPower(int power) {
        if (power > 0){
            this.power = power;
        }else{
            this.power = 1;
        }
    }
    
}