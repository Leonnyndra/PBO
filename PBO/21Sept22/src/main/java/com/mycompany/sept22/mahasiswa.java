/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sept22;

/**
 *
 * @author ACER
 */
public class mahasiswa {

    public String NIM, Nama, JK;

    public void TN() {
        System.out.println(Nama);
    }

    public void kelamin() {
        if (JK.equals("Laki")) {
            System.out.println("Anda adalah Mahasiswa");
        } else if (JK.equals("Wanita")) {
            System.out.println("Anda adalah Mahasiswi");
        } else {
            System.out.println("Salah Input");
        }
    }
    
    public void cekprodi(){
        String a=NIM.substring(0, 2);
        if(a.equals("67")){
            System.out.println("TI");
        }
        
        else if(a.equals("68")){
            System.out.println("SI");
        }
        
        else if(a.equals("69")){
            System.out.println("DKV");
        } else {
            System.out.println("Salah Input");
        }    
    }
    
    public void cekangk(){
        System.out.println(NIM.substring(2, 6));
    }
}

