/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GifMaker;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.*;

/**
 *
 * @author Braedon <your.name at your.org>
 */
public class imageToGif extends JPanel implements ActionListener {
    private Timer time;
    private ImageIcon imageArray[];
    private int delay = 100, totalFrames = 15, currentFrame = 0;
    
    
    public imageToGif() {
        imageArray = new ImageIcon[totalFrames];
        for (int i = 0; i < imageArray.length; i++) {
           ImageIcon icon = new ImageIcon("C:\\Users\\Burden\\Pictures\\gifImages\\" + "Frame" + (i+1) + ".jpg");
                 
            Image scaleImage = icon.getImage().getScaledInstance(1000, 800,Image.SCALE_DEFAULT);
             imageArray[i] = new ImageIcon(scaleImage);
        }
        time = new Timer(delay,this);
        time.start();
        
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (currentFrame == imageArray.length) {
            currentFrame = 0;
        }
    
        imageArray[currentFrame].paintIcon(this,g,0,0);
            currentFrame++;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      repaint();
    }
    
}

