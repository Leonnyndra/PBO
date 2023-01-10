/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarpolimorph;

/**
 *
 * @author ACER
 */
public class Kucing extends Binatang implements Sifat{
    public int kecepatan;

    @Override
    public void cetakSifat() {
        System.out.println("Sifat dari: "+super.nama+" adalah suka mencakar");
    }

    @Override
    public void cetakBiodata() {
        System.out.println("Nama: "+super.nama);
        System.out.println("Ras: "+super.ras);
        System.out.println("Jumlah kaki: "+super.jumlahkaki);
        System.out.println("Kecepatan: "+kecepatan);
    }
}
