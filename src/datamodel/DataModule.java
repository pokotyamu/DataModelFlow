/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datamodel;

import java.util.ArrayList;

/**
 *
 * @author pokotyamu
 */
public abstract class DataModule {
    abstract ArrayList<String> dataFunction(ArrayList<User> users);
}
