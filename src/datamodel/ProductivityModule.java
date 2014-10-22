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
public class ProductivityModule extends DataModule{

    @Override
    ArrayList<String> dataFunction(ArrayList<User> users) {
        ArrayList<String> returndata = new ArrayList();
        for (User user: users) {
            returndata.add(user.getData());
        }

        return returndata;
    }
    
}
