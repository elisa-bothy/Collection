/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author Elisa Bothy
 */
public class Garage extends ArrayList<Car> {
    private String sign;//L'enseigne du garage

    public String getSign() {
        return sign;
    }

    public Garage(String sign) {
        super();
        this.sign = sign;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Garage{");
        sb.append("Enseigne=").append(sign);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
