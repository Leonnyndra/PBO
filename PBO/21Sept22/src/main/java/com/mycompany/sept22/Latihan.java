/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sept22;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Latihan {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       mahasiswa maha=new mahasiswa ();
       
        System.out.println("Masukan nama anda : ");
        maha.Nama = sc.nextLine();
        
        System.out.println("Masukan NIM anda : ");
        maha.NIM=sc.nextLine();
        
        System.out.println("Masukan Jenis kelamin : ");
        maha.JK=sc.nextLine();
        
        maha.TN();
        maha.kelamin();
        
        maha.cekprodi();
        maha.cekangk();
    }
    
}