/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author START
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        ArrayList<String> commands = new ArrayList<>();
        commands.add("go to work");
        commands.add("rest");
        commands.add("what are you doing?");
        commands.add("start laying bricks");
        
        //declare commands here
        System.out.println("List of commands:");
        for(String i :commands) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Enter your command: ");
        
        // set builder's loogic here
        Builder builder = new Builder(new BuildersMethods());

        // start execution here
        String s = in.nextLine(); 
        while(!s.equals( "quit")) {
            try {
               builder.start(s); 
            } catch (IncorrectFlow e) {
                System.out.println(e.getMessage()); 
            }
            
            s = in.nextLine();
        }
  
        
        
    }
}
