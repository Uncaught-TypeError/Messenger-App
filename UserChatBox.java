/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messenger;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class UserChatBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What's your name? (Player 1)");
            String name1 = sc.next();
            User u1 = new User(name1);
            System.out.print("Message: ");
            String msg1 = sc.next();
            u1.Message(msg1);
            System.out.println("What's your name? (Player 2)");
            String name2 = sc.next();
            User u2 = new User(name2);
            System.out.print("Message: ");
            String msg2 = sc.next();
            u2.Message(msg2);
        }
    }

}
