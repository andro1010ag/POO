/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7fundamentals.oopfundamentals.interfaces;

/**
 *
 * @author Andres Garcia
 */
public class WildAnimal implements Animal {

    int remeaningAnimals;
    
    public boolean isInDanger(){
        boolean danger;
        danger=(remeaningAnimals<=10)? true:false;
                return danger;
    
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sleep(int time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
