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
public class Person {
    private String name;
    private String address;
    private int age;
    
    void inputDetails(String name, String address, int age){
        this.name = name;
        this.address=address;
        this.age=age;
    }
    
    void displayDetails(){
        System.out.println("Thong tin la");
        System.out.println("Ten la"+this.name);
        System.out.println("Dia chi la"+this.address);
        System.out.println("Tuoi la"+this.age);
    }
}
