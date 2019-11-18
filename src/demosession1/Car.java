/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosession1;

/**
 *
 * @author Lrandom
 */
public class Car {
    private float price;
    private String color;
    private String type;

    public Car() {
    }
    
    public Car(float price, String color, String type){
        this.price=price;
        this.color=color;
        this.type=type;
    }
    
    public void displayDetails(){
            System.out.println("Thong tin xe la");
            System.out.println("Gia "+this.price);
            System.out.println("Mau "+this.color);
            System.out.println("Loai "+this.type);
    }
}
