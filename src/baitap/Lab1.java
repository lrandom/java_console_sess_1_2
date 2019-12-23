/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.ArrayList;

/**
 *
 * @author Lrandom
 */
public class Lab1<E> {
    public <E> void display(ArrayList<? extends Number> thamsos){
        System.out.println("Chieu dai cua arraylist la "+thamsos.size());
        for(int i =0; i < thamsos.size();i++){
            System.out.println(thamsos.get(i));
        }
    }
    
    public static void main(String[] args) {
       Lab1<Integer> lab1 = new Lab1<>();
       ArrayList<Integer> thamsos = new ArrayList();
       thamsos.add(1);
       lab1.display(thamsos);
      
    }
}
