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
    
    private String data1;
    private String data2;
    
    
    User(String name) {
        this.name = name;
        this.data1 = "入力データ１";
        this.data2 = "入力データ２";
    }

    public String getName(){
        return this.name;
    }

    public String getData1() {
        return this.data1;
    }

    public String getData2(){
        return this.data2;
    }
    
    
}
