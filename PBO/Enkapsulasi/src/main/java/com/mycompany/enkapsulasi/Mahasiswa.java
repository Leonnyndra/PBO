/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    private String password;
    private double ipk;
    private double tagihan;
    
    //isi setter password
    public void setPassword(String p) {
        this.password = p;
        }
   
    //ini getter password
    public String getPassword(){
        return this.password;
    }
    
    //ini setter ipk
    public void setIpk(double i) {
        this.ipk = i;
    }
    
    //ini getter ipk
    public double getIpk(){
           return this.ipk;     
    }
    
        //isi setter tagihan
    public void setTagihan(double t) {
        this.tagihan = t;
        }
   
    //ini getter tagihan
    public double getTagihan(){
        return this.tagihan;
    }
    
}
