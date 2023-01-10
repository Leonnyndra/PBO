/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.okt22;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class objekMahasiswa {
    public static void main(String[] args) {
        
    //objek
    Mahasiswa mh=new Mahasiswa();
    
    //temp
    String[][] temp;
    temp=mh.tampilkan();
    
  
    for (int i = 0; i < temp.length; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(temp[i][j] + "\t");
        }
            System.out.println("");    
    }
    
    Scanner sc=new Scanner (System.in);
        System.out.println(" Cari NIM= ");
        String cari=sc.nextLine();
        
        if(mh.cari(cari) == true){
            System.out.println("ada");}
        else{System.out.println("tidak ada");}
    }
    
    
}
