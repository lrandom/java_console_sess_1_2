/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lrandom
 */
public class ShoppingCart {

    class Product{
       private String id;
       private String name;
       private float price;
       private int quantity;

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

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        } 
    }
    
    HashMap<String, Product> cart = new HashMap<>();
    
    public void buy(Product product){
        cart.put(product.getId(), product);
    }
    
    public void delete(String id){
        cart.remove(id);
    }
    
    public float checkout(){
        float sum=0;
        for (Map.Entry<String, Product> entry : cart.entrySet()) {
            ShoppingCart.Product product = entry.getValue();
            sum+=product.getPrice();
        }
        return sum;
    }
    
    public void updateQuantity(String id){
        Product product = this.cart.get(id);
        int quantity = product.getQuantity();
        quantity++;
        product.setQuantity(quantity);
        this.cart.put(id, product);
    }
    
    public void find(){
        for (Map.Entry<String, Product> entry : cart.entrySet()) {
            ShoppingCart.Product product = entry.getValue();
            if(product.getPrice()>1000){
                System.out.println("id"+product.getId());
                System.out.println("name"+product.getName());
            }
        }
    }
}
