/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.new_project;

import java.util.HashMap;
/**
 *
 * @author 63953
 */
public class USER_AND_PASS {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
        USER_AND_PASS(){

            logininfo.put("ADMIN", "ADMIN");
            logininfo.put("admin", "admin");
            logininfo.put("a", "a");

        }

    public HashMap getlogininfo() {
            return logininfo;
    }
    
    
}
