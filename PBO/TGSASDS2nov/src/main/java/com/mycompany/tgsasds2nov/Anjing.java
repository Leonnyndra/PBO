package com.mycompany.tgsasds2nov;

public class Anjing extends Binatang {
    private int Kecepatan;
    public String Ras;

    public int getKecepatan()
    {
        return Kecepatan;
    }

    public void setKecepatan(int Kecepatan)
    {
        this.Kecepatan = Kecepatan;
    }

    @Override
    public void Cetak() {
        System.out.println("Jenis Binatang : " + this.Jenis);
        System.out.println("Nama           : " + this.Nama);
        System.out.println("Ras            : " + this.Ras);
        System.out.println("Kecepatan      : " + this.Kecepatan + " mph");   
        System.out.println(" ");
    }

    @Override
    public void CetakNama() {
        System.out.println(this.Nama);        
    }
}