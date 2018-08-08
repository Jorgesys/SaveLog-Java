/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savelog;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author osorio
 */
public class SaveLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Logger logger = Logger.getLogger("MyApplicationLog");      
    String pathLog = "C:/Data/MyLog.log";
    try {      
        
        FileHandler fhandler = new FileHandler(pathLog);  
        logger.addHandler(fhandler);
        SimpleFormatter formatter = new SimpleFormatter();  
        fhandler.setFormatter(formatter);  
        
    } catch (SecurityException e){  
        e.printStackTrace();  
    } catch (IOException e){  
        e.printStackTrace();  
    }      
    
    
 
       logger.info("Probando el código!");
       try {            
            String a = "SO";
            int b = Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            logger.info("ocurrió un error en el código!");
            logger.info("NumberFormatException " + ex.getMessage());
        }
        logger.info("terminé...");
    }
    
}
