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
public class Pupils {
   String id;
   String name;
   String address;
   String className;

    public Pupils() {
    }

    public Pupils(String id) {
        this.id = id;
    }
   
    public Pupils(String id, String name){
        
    }
    
    public Pupils(String id, String name, String address){
        
    }
    
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    
     
}
