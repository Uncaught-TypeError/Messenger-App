/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messenger;

/**
 *
 * @author Asus
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public User(String name){
        this.name = name;
    }
    public void Message(String message){
        Chatbox.showMessage(this, message);
    }
}
