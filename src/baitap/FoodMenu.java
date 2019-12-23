/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class FoodMenu {
    private ArrayList<String> menus=new ArrayList<String>();
    
    public void add(){
        Scanner scanner;
        for (int i = 0; i < 5; i++) {
            scanner = new Scanner(System.in);
            System.out.println("Vui long nhap mon thu "+(i+1));
            String item = scanner.nextLine();
            menus.add(item);
        }
    }
    
    public void delete(){
        this.menus.remove(4);
        System.out.println("Đo dai cua menu la"+this.menus.size());
    }
    
    public void replace(){
        this.menus.set(3, "Cua hoang de alaska");
        System.out.println(this.menus.get(3));
    }
    
    public void check(){
        boolean check = this.menus.equals("Tôm hùm bỏ lò phomai");
        if(check){
            System.out.println("Co ton tai ");
        }else{
            System.out.println("Khong ton tai");
        }
    }
    
    public void deleteAll(){
        this.menus.clear();
    }
    
    public void getInfo(){
        System.out.println("Thong tin thanh phan dau tien"+this.menus.get(0));
        System.out.println("Thong tin cuoi cung"+this.menus.get(this.menus.size()-1));
    }
    
    
    public static void main(String[] args) {
        FoodMenu foodMenu = new FoodMenu();
        do {            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vui long chon");
            System.out.println("a. Them phan tu");
            System.out.println("b. Xoa phan tu");
            System.out.println("c. Thay the phan tu");
            System.out.println("d. Kiem tra ton tai cua phan tu");
            System.out.println("e. Xoa tat ca");
            System.out.println("f. Lay ve thong tin phan tu dau va cuoi");
            String key = scanner.nextLine();
            switch(key){
              case "a":
                  foodMenu.add();
                  break;
                  
              case "b":
                  foodMenu.delete();
                  break;
                  
              case "c":
                  foodMenu.replace();
                  break;
                  
              case "d":
                  foodMenu.check();
                  break;
                  
              case "e":
                  foodMenu.deleteAll();
                  break;
                  
              case "f":
                  foodMenu.getInfo();
                  break;
                  
              default:
                  System.exit(0);
            }
        } while (true);
    }
}
