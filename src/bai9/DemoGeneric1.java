/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import demosession1.Person;

public class DemoGeneric1 <T extends Person>{
    /*public void display(String[] strings){
        for (String myString : strings) {
            System.out.println(myString);
        }
    }
    
    public void display(Integer[] interger){
        for (Integer myInteger : interger) {
            System.out.println(myInteger);
        }
    }*/
    
    
    public <E> E display(E[] elems){
        for(E myElems: elems){
            System.out.println(myElems);
        }
        return elems[0];
    }
}
