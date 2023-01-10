package com.mycompany.sept22;

public class Tahun {
    public int tahun;
    
    public String cekKabisat(){
        if (tahun%4==0) return "Kabisat";
        else return "Bukan Kabisat";
    }
    
    
}
