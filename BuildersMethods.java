/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.challenge;

import com.mycompany.challenge.Printer.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author START
 */
public class BuildersMethods implements BulderLogic {
    @Override
    public void goToWork(boolean isResting) {
        isResting = false;
        seeIfRests(isResting);
    }
    
    @Override
    public void rest(boolean isResting) {
        isResting = true;
        seeIfRests(isResting);
    }
    
    @Override
    public void seeIfRests(boolean isResting) {
        Printer.seeIfWorks(isResting);
    }
    
    @Override
    public void layBricks(int bricksLayed, boolean isResting) {
        if(isResting) {
            throw new IncorrectFlow("Errore");
        }
        
        for(int i=1; i<=100; i++ ) {
            bricksLayed =i;
        }
        
    }
}
