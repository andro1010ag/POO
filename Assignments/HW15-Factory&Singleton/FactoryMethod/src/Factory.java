/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Garcia
 */
public abstract class Factory {
    public Factory(){        
    }

    public abstract Connection creatConnection(String type);
}
