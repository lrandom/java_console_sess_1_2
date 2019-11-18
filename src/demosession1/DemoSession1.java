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
//           int keyChoice ;
//           do{
//               System.out.println("Moi ban chon");
//               System.out.println("1, Them");
//               System.out.println("2, Xoa");
//               System.out.println("3, Tim kiem");
//               System.out.println("4, Thoat");
//               Scanner scanner = new Scanner(System.in);
//               keyChoice = scanner.nextInt();
//               switch(keyChoice){
//                   case 1:
//                       System.out.println("Them du lieu");
//                       break;
//                   case 2:
//                       System.out.println("Xoa du lieu");
//                       break;
//                   case 3:
//                       System.out.println("Tim kiem");
//                       break;
//               }
//               
//           }while(keyChoice!=4);
//           
//           System.out.println("ABC");
//       int mang[] = new int[4];
//       mang[0]=0;
//       mang[1]=1;
//       mang[2]=3;
//       mang[3]=4;
//       
//       for(int i=0;i<mang.length;i++){
//           System.out.println(mang[i]);
//       }
//       
//       for(int num: mang){
//           System.out.println(num);
//       }
//       
//       int mang2[]={10,20,30,40 };
//       for(int j=0;j<mang2.length;j++){
//           System.out.println(mang2[j]);
//       }
//       
//       int[] mang3 = new int[4];
//       mang3[0]=0;
//       mang3[1]=1;
//       mang3[2]=3;
//       mang3[3]=4;
//       
//          
//       for(int num: mang3){
//           System.out.println(num);
//       }
//       
//       
//       int mangHaiChieu[][] = new int[2][2];
//       mangHaiChieu[0][0]=10;
//       mangHaiChieu[0][1]=20;
//       mangHaiChieu[1][0]=30;
//       mangHaiChieu[1][1]=40;
//       
//       for(int i =0; i<2;i++){
//          for(int j = 0;j<2;j++){
//              System.out.println(mangHaiChieu[i][j]);
//          }
//       }
//         String fullName = "Nguyen Thanh Luan";
//         System.out.println(fullName.charAt(0));
//         System.out.println(fullName.indexOf("N"));
//         System.out.println(fullName.equalsIgnoreCase("nguyen thanh luan"));
//         System.out.println(fullName.replace("a", "o"));
//         System.out.println(fullName.concat(" Ha Long"));
//         System.out.println(fullName.startsWith("N"));
//         System.out.println(fullName.endsWith("n"));
//           StringBuilder stringBuilder = new StringBuilder("NIIT HA NOI");
//           stringBuilder.reverse().append("abc");
//           System.out.println(stringBuilder.toString());
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhap vao so pt cua mang");
//            int lengthArray = scanner.nextInt();
//            float arr[] = new float[lengthArray];
//            
//            for (int i = 0; i < lengthArray; i++) {
//               System.out.println("Nhap phan tu thu "+(i+1));
//               Scanner scanner1 = new Scanner(System.in);
//               arr[i]=scanner1.nextFloat();
//            }
//            
//            float max = arr[0];
//            
//            for (int i = 1; i < lengthArray; i++) {
//               if(max<arr[i]){
//                   max=arr[i];
//               }
//            }
//            
//            float min = arr[0];
//            
//            for (int i = 1; i < lengthArray; i++) {
//               if(min>arr[i]){
//                   min=arr[i];
//               }
//            }
//            
//            System.out.println("Max la"+ max);
//            System.out.println("Min la"+ min);
//            
//            float sum =0;
//            int count = 0;
//            for (int i = 1; i < lengthArray; i++) {
//               if(arr[i]%5==0){
//                  sum+=arr[i];
//                  count++;
//               }
//            }
//            
//            System.out.println("Trung binh cong cac so chia het cho 5 la "+(sum/count));
//Sắp xếp tăng dần
//        int mang[] = {0,1,5,3,2,4,5,6,8,10};
//        for(int i = 0; i < mang.length-1;i++){
//           for(int j =1; j<mang.length; j++){
//               if(mang[i] < mang[j]){
//                  int temp = mang[i];
//                  mang[i]=mang[j];
//                  mang[j]=temp;
//               }
//           }
//        }
//        
//        System.out.println("Mang sau khi săp xep");
//        for(int i = 0; i < mang.length-1;i++){
//            System.out.println(mang[i]);
//        }
//        Pupils svA = new Pupils();
//        svA.setId("001");
//        svA.setName("Nguyen Van A");
//        svA.setClassName("K46");
//        svA.setAddress("Ha Noi");
//        
//        System.out.println("Thong tin cua sv co ma "+svA.getId());
//        System.out.println("Ho ten "+svA.getName());
//        System.out.println("Dia chi "+svA.getAddress());
//        System.out.println("Lop "+svA.getClassName());
//        
//    
//        Pupils svB = new Pupils("002", "Nguyen Van B");
//
//        Person personA = new Person();
//        personA.inputDetails("Nguyen Van A","Ha Noi" ,28);
//        personA.displayDetails();
//        
//        Person personB = new Person();
//        personB.inputDetails("Nguyen Van B", "Quang Ninh", 27);
//        personB.displayDetails();
//          Car car = new Car(50000, "Đo", "SUV");
//          car.displayDetails();
        NhanVien nvs[] = new NhanVien[3];
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao ma ");
            int ma = scanner.nextInt();
            System.out.println("Nhap vao hoten");
            scanner = new Scanner(System.in);
            String hoten = scanner.nextLine();
            System.out.println("Nhap vao luong");
            scanner = new Scanner(System.in);
            float luong = scanner.nextFloat();
            NhanVien nv = new NhanVien(ma, hoten, luong);
            nvs[i] = nv;
        }

        for (int i = 0; i < 3; i++) {

            System.out.println("Nhan vien thu " + (i + 1));
            System.out.println("Ma " + nvs[i].getMa());
            System.out.println("Hoten " + nvs[i].getHoten());
            System.out.println("Luong " + nvs[i].getLuong());

        }

    }
}
