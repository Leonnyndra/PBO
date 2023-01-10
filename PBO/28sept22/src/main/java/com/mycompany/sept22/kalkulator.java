package com.mycompany.sept22;

import java.util.Scanner;

public class kalkulator {
    
        //  ATTRIBUT
    // AM TD NA
    public int angka1;
    public int angka2;
    
    //METHOD
    //AM TD NA(){...} INT VOID
    
     public static void main(String[] args) {
    //MEMBUAT OBJEK
    //NKELAS NOBJEK = NEW NKELAS();
    kalkulator kal = new kalkulator();
    
    //MANUAL
//    kal.angka1=5;
//    kal.angka2=2;

    //SCANNER
    Scanner sc=new Scanner (System.in);
         System.out.println("Angka 1= ");
         kal.angka1 = sc.nextInt();
         System.out.println("Angka 2= ");
         kal.angka2 = sc.nextInt();
         
    kal.tambah();
    kal.kurang();
    System.out.println("Hasil Kali= "+kal.kali());
    System.out.println("Hasil Bagi= "+kal.bagi());
    System.out.println("Hasil Pangkat= "+kal.pangkat(4, 2));
}
     
    //METHOD VS VARIABEL LOKAL 
    //PARAMETER
    //AM TD Method(PARAMETER){...}
    public double pangkat(int a, int b) {
            double pang =  Math.pow(a, b);
            return pang;
    }
    //VOID
    public void tambah(){
        //ISI METHOD
        int htambah = angka1 + angka2;
        System.out.println("Hasil Tambah: "+htambah);
    }
    
    public void kurang(){
        int hkurang = angka1 - angka2;
        System.out.println("Hasil Kurang: "+hkurang);
    }   
        //NON VOID
    public int kali(){
    int hkali = angka1 * angka2;
        return hkali;
    }
    
    public double bagi(){
    double hbagi = angka1 / angka2;
        return hbagi;
    }
}
    
    

