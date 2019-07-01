/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renamer;

import java.io.File;

/**
 *
 * @author Braedon <your.name at your.org>
 */
public class ImageRenamer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       File folder = new File("C:\\Users\\Burden\\Pictures\\rename");
       File[] listOfFiles = folder.listFiles();
       
       for (int i = 0; i < listOfFiles.length; i++) {
           
           if (listOfFiles[i].isFile()){
               
               File f = new File("C:\\Users\\Burden\\Pictures\\rename\\"+listOfFiles[i].getName());
               f.renameTo(new File("C:\\Users\\Burden\\Pictures\\rename\\"+i+"anything.jpg"));
             
               
               
           }
        
    }
    
       System.out.println("conversion is done");
   }
    
}