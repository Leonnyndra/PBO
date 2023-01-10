package com.mycompany.project220922;

import java.util.Scanner;

public class Project220922 {

    public static void main(String[] args) {
        
        //deklarasi dan ukuran
        double[] kp = new double[9];
        
        //mode 1. satu-satu (by case langsung masuk ke no sekian)
        kp[3]=10;
        
        //mode 2. Rombongan
        String[] ps={"qwe", "rty", "uio", "asd", "fgh", "zxc", "mnb"};
        System.out.println("Kamar 0"+ps[0]);
        
        //mode 3. Input by user
        Scanner rmsk =new Scanner (System.in);
//        System.out.println("Indeks ke 0: ");
//        kp[0]=rmsk.nextInt();
//        System.out.println("Indeks ke 2: ");
//        kp[1]=rmsk.nextInt();
        
        //mode 4. menggunakan Looping Dased on Database
        for (int i = 0; i < kp.length; i++) {
            System.out.println("Indeks ke "+i+": ");
            kp[i]=rmsk.nextInt();
            
            
        }
        
        //Akses/dicetak
//        try {
//            kp[9]=90;
//            System.out.println("Kamar 9: "+kp[9]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Indeks tidak ada");
//        } catch (Exception e) {
//            System.out.println("Error Global");
//        } finally{
//            System.out.println("Tetap tercetak");
//        }              
    }
}
