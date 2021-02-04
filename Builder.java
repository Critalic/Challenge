/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.challenge;

/**
 *
 * @author START
 */
public class Builder {
    private boolean isResting;
    private int minutesWorked;
    private int bricksLayed;
    private int minutesRested;
    private BuildersMethods methods;
    
    public Builder(BuildersMethods methods) {
        this.methods = methods;
    }
    
    // figure out what user wants
    public void start(String s) {
        switch(s) {
            case "go to work":
                methods.goToWork(isResting); 
                break;
                
            case "rest":
                methods.rest(isResting);
                break;
                
            case "what are you doing?":
                methods.seeIfRests(isResting);
                break;
                
            case "start laying bricks":
                if(isResting) throw new InstantiationException("lsjdhg");
                methods.layBricks(bricksLayed, isResting);
                
                break;
                
            default: 
                System.out.println("Please, enter a valid command");
                break;
        }
    }
}
