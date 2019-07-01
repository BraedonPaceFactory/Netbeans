/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GifMaker;

import javax.swing.JFrame;

/**
 *
 * @author Braedon <your.name at your.org>
 */
public class userInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrame f = new JFrame();
      imageToGif a = new imageToGif();
      f.add(a);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(1000,800);
        
    }
    
}
