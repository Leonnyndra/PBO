/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.okt22;

/**
 *
 * @author ACER
 */
public class Mahasiswa {

    public String[][] data
            = {
                {"672021244", "irene", "4.00"},
                {"672021238", "ino", "4.00"},
                {"672021256", "bimo", "4.00"},
                {"672021258", "krisna", "4.00"},
                {"672021023", "camuels", "4.01"},};

    //method
    public String[][] tampilkan() {
        return data;
    }

    public boolean cari(String keyword) {
        //1. unboxing data for
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 3; j++) {

                //2. mencari menggunakan if
                if (keyword.equals(data[i][j])) {
                    //ketemu return true

                    return true;
                }
            }
        }
        //tidak return false

    

return false;
}
}
