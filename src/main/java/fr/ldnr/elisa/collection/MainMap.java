/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Elisa Bothy
 */
public class MainMap {
    public static void main(String[] args){
        Map<String, Integer> desserts = new HashMap<>();
        
        desserts.put("Mousse au chocolar", 5);
        desserts.put("Glasse au chocolat", 9);
        desserts.put("Tarte aux pommes", 18);
        desserts.put("Mystère", 5);
        desserts.put("Mousse au chocolar", 5);
        
        for(String key : desserts.keySet()){
            System.out.println("key = " + key + "||value:" + desserts.get(key));
        }
        
        for(Integer i: desserts.values()){
            System.out.println("i = " + i);
        }
        
        for (Map.Entry<String, Integer> entry : desserts.entrySet()){
            System.out.println("entry = " + entry.getKey() +"||value:" + entry.getValue());
        }
        
    }
}
