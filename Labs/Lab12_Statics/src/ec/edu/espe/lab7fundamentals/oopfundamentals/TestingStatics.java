/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7fundamentals.oopfundamentals;
import ec.edu.espe.lab7fundamentals.oopfundamentals.utils.Tax;

/**
 *
 * @author Andres Garcia
 */
public class TestingStatics {
    
    public static void main(String[] args) {
        
        float price;
        float pvp;
        
        price=10;
        pvp= Tax.computeIva(price);
        System.out.println("The pvp of "+price+" is "+pvp);
        pvp=Tax.computeTotal(price); 
        System.out.println("The pvp of " +price+" is "+pvp);
    }
}
