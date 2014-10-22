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
       System.out.println(args[0]);
       //入力は、User名とDataModule名であるProductivity
       
       ArrayList<User> users = new ArrayList();
       users.add(new User(args[0]));
       DataModule dm = DataModuleFactory.create(args[1]);
       ArrayList<String> dataList = dm.dataFunction(users);
       
       for (String string : dataList) {
           System.out.println(string);
           
       }
       
   }
   
}
