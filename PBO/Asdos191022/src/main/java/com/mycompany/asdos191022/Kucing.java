/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asdos191022;

/**
 *
 * @author ACER
 */
public class Kucing extends Binatang {
    private int berat;

    public void setBerat(int n) {
        this.berat = n;
    }
    public int getBerat() {
        return this.berat;
    }

    public void mengeong(String a) {
        System.out.println("Meong! " + a);
    }
}