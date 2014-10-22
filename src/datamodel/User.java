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
class User {
    private final String name;

    User(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
