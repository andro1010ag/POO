/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab5aggregation.model;

/**
 *
 * @author Andres Garcia
 */
public class B {
        String data;
    
    public B(int i){
        data = new String("");
        data="Object B #" +i;
    }
    
    @Override
    public String toString(){
        return data;
    }
}
