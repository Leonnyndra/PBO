/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asdos191022;

/**
 *
 * @author ACER
 */
public class Binatang {
    private String kodeBinatang, nama, pemilik;
    public int usia, berat;

    public void setKodeBinatang(String a, int n) {
        this.kodeBinatang = a + String.format("%03d", n);
    }
    public String getKodeBinatang() {
        return this.kodeBinatang;
    }

    public void setNama(String a) {
        this.nama = a;
    }
    public String getNama() {
        return this.nama;
    }

    public void setPemilik(String a) {
        this.pemilik = a;
    }
    public String getPemilik() {
        return this.pemilik;
    }
}
