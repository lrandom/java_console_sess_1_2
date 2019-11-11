/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosession1; 

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Lrandom
 */

public class DemoSession1 {

    /**
     * @param args the command line arguments
     */
//    static int calc(int type,int a, int b){
//        //
//        if(type==1){
//            //tinh cong
//            return a+b;
//        }
//        
//        if(type==2){
//            //tinh tru
//            return a-b;
//        }
//        
//        //return a+b;
//        return -1;
//    }
//    
    public static void main(String[] args) {
        // TODO code application logic here
//        int num = 1;
//        int totalNumber;
//        totalNumber= calc(2,10,20);
//        System.out.println(totalNumber);
//        
        //System.out.println("Gia tri cua num1 la "+num1+" "+num1+" "+num1);
        //System.out.printf("Gia tri cua num1 la %d %d %d", num1,num1,num1);
        
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        System.out.println("Ban vua nhap vao"+num);
//        
     ///   System.out.printf("Dong 1");
     //   System.out.printf("\nDong 2 \"aka\"");
       /// for(num=1;num<=10;num++){
   
           //gfgh
            //System.out.println(num);
            //if(num==6){
               // continue;
            //}
           
        //}
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        boolean flag = true;
//        if(num <= 1){
//            System.out.println("Khong phai la so nguyen to");
//            return;
//        }
//        
//        
//        for (int i = 2; i < num; i++) {
//            if(num%i==0){
//                //xuat hien mot so khac 1 va chinh no ma no co the chia het
//                //System.out.println("So nay ko phai la so nguyen to");
//                flag=false;
//                break;
//            }
//        }
//        
//        if(flag==true){
//            System.out.println("Day la so nguyen to");
//        }else{
//            System.out.println("Day ko phai la so nguyen to");
//        }
//        
           int keyChoice ;
           do{
               System.out.println("Moi ban chon");
               System.out.println("1, Them");
               System.out.println("2, Xoa");
               System.out.println("3, Tim kiem");
               System.out.println("4, Thoat");
               Scanner scanner = new Scanner(System.in);
               keyChoice = scanner.nextInt();
               switch(keyChoice){
                   case 1:
                       System.out.println("Them du lieu");
                       break;
                   case 2:
                       System.out.println("Xoa du lieu");
                       break;
                   case 3:
                       System.out.println("Tim kiem");
                       break;
               }
               
           }while(keyChoice!=4);
           
           System.out.println("ABC");
        
    }
}
