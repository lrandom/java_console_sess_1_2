/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Lrandom
 */
public class Bike extends Vehicle{

    public Bike() {
        this.color="Mau do";
        this.price=100000;
    }
    
   
    
    public void printDetails(){
        System.out.println("Thông tin là");
        System.out.println(this.color);
        System.out.println(this.price);
    }   

    @Override
    public void accelerate() {
        //super.accelerate(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tang toc len 60km/h");
    }
    
    
}
