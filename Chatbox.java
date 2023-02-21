/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messenger;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Chatbox {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+" ["+user.getName()+" ] : "+ message);
               
    }
}
