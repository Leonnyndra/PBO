//2 Nov 2022
package com.mycompany.belajarpolimorph;

/**
 *
 * @author ACER
 */
public class Tester {
    public static void main(String[] args) {
        Binatang b;
        Kucing k;
        
        k = new Kucing();
        k.nama = "Nama1";
        k.ras = "Ras1";
        k.jumlahkaki = 4;
        k.kecepatan = 10;
        
        System.out.println("==================");
        k.cetakBiodata();
        System.out.println("==================");
        k.cetakSifat();
        
        //polimorph
        b = k;
        System.out.println(b.nama);
        
        k = (Kucing) b;
        k.cetakBiodata();
        
    }
}
