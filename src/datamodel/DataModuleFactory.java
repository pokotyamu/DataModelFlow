/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datamodel;

/**
 *
 * @author pokotyamu
 */
public class DataModuleFactory {

    public static DataModule create(String dmname) {
        DataModule dm = null;
        
        switch(dmname){
            case "Productivity" :
                dm = new ProductivityModule();
        }
        
        return dm;
    }

}
