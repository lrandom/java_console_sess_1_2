/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class FileHelper {
    public static String sourcePath;
    public static String destPath;
    public static void copyFile(){
        System.out.println("Nhap duong dan nguon");
        System.out.println("Nhap duong dan dich");
        Scanner scanner = new Scanner(System.in);
        sourcePath = scanner.nextLine();
        scanner = new Scanner(System.in);
        destPath = scanner.nextLine();
        
        File file = new File(sourcePath);
        if(file.exists() && file.isFile() && file.canRead()){
           //copy file o doan nay;
            try {
                FileOutputStream fos = new FileOutputStream(destPath);
                FileInputStream fis = new FileInputStream(file);
                int data=0;
                while((data=fis.read())!=-1){
                  fos.write(data);
                }
                fos.flush();
                fos.close();
                fis.close();
                System.out.println("Copy file thanh cong");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("File ko ton tai || file ko cho phep copy");
        }
    }
}
