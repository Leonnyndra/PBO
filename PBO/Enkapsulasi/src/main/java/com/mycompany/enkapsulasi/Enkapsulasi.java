// 19 Okt 22

package com.mycompany.enkapsulasi;

/**
 *
 * @author ACER
 */
public class Enkapsulasi {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        
        //mengisi data
        m1.nim="672021152";
        m1.nama = "Lee";
        m1.setPassword("L33");
        m1.setIpk(2.33);
        m1.setTagihan(1000000);
        
        //mencetak data
        System.out.println(m1.nim);
        System.out.println(m1.nama);
        System.out.println(m1.getPassword());
        System.out.println(m1.getIpk());
        System.out.println(m1.getTagihan());
    }
}
