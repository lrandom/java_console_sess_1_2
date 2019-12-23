/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lrandom
 */
public class DemoThread3 {
    public synchronized void printData(){
        System.out.println("Thread 1");
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DemoThread3.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(i);
            if(i==5){
               System.out.println("I am waitting you");
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(DemoThread3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public synchronized void printData2(){
        System.out.println("Thread 2");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                sleep(1000);
                if(i==4){
                    notify();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(DemoThread3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
