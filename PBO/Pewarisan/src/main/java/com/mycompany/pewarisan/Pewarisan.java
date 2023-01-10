//19 Okt 2022

package com.mycompany.pewarisan;

/**
 *
 * @author ACER
 */
public class Pewarisan {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.NIK="123456";
        m1.nama="Lee";
        m1.nim="672021152";
        m1.prodi="TI";
        m1.fak="FTI";
        m1.setTtl("ttlo");
        
        System.out.println(m1.NIK);
        System.out.println(m1.nama);
        System.out.println(m1.nim);
        System.out.println(m1.prodi);
        System.out.println(m1.fak);
        System.out.println(m1.getTtl());
    }
}
