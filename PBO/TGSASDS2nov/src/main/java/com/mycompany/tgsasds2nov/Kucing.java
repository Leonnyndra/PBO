package com.mycompany.tgsasds2nov;

public class Kucing extends Binatang{
    public String Ras;
    private int Berat;

    public int getBerat() {
        return Berat;
    }
    
    public void setBerat(int berat) {
        Berat = berat;
    }

    @Override
    public void Cetak() {
        System.out.println("Jenis binatang : " + this.Jenis);
        System.out.println("Nama           : " + this.Nama);
        System.out.println("Ras            : " + this.Ras);
        System.out.println("Berat          : " + this.Berat + " kg");
        System.out.println(" ");
    }

    @Override
    public void CetakNama() {
        System.out.println(this.Nama);   
    }
}