/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asdos191022;

/**
 *
 * @author ACER
 */
public class Anjing extends Binatang {
    private int kecepatan;

    public void setKecepatan(int a) {
        this.kecepatan = a;
    }
    public int getKecepatan() {
        return this.kecepatan;
    }

    public void menggonggong(String a) {
        System.out.println("Gukk! " + a);
    }
}
