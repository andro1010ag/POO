/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab25;

import com.mongodb.DB;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres Garcia
 */
public class Connect {
    private DB db;

 
    public Connect() {
     try {
         Mongo mongo = new Mongo("localhost",27017);
         db = mongo.getDB("TvSeries");
     } catch (UnknownHostException ex) {
         Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
     }      
    }

    public DB getDb() {
        return db;
    }
}
