/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lrandom
 */
public class DemoThread extends Thread{
        String name;
        public DemoThread(String name) {
            this.name= name;
        }

        @Override
        public void run() {
            super.run(); //To change body of generated methods, choose Tools | Templates.
           // System.out.println(this.name);
            for(int i = 0; i<10; i++){
                System.out.println(this.name);
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DemoThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
     


