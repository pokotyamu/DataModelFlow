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
public class Main {

   public static void main(String[] args) {
       System.out.println("==DataModelFlow==");
       
       ArrayList<User> users = new ArrayList();
       users.add(new User(args[0]));
       users.add(new User(args[1]));
       
       
       DataModule dm = new ProdcutivityModule();
       ArrayList<String> dataList = dm.dataFunction(users);
       
       
       
   }
   
}
