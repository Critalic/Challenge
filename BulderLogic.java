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
public interface BulderLogic {
    public void goToWork(boolean isResting);

    public void rest(boolean isResting) ;
    
    public void seeIfRests(boolean isResting);
    
    public void layBricks(int bricksLayed, boolean isResting);
}
