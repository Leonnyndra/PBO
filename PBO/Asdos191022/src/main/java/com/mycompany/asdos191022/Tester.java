/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asdos191022;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0, jumlah = 0, ku = 1, an = 1;
        String pilihan = null, data = null;

        System.out.print("Masukkan jumlah binatang: ");
        jumlah = in.nextInt();
        in.nextLine();

        Anjing a[] = new Anjing[jumlah];
        Kucing k[] = new Kucing[jumlah];

        while (count < jumlah) {
            System.out.print("\nJenis binatang (Anjing/Kucing): ");
            pilihan = in.nextLine();
            switch (pilihan) {
                case "Anjing":
                case "anjing":
                case "a":
                case "A":
                    a[count] = new Anjing();
                    a[count].setKodeBinatang("A", an);
                    System.out.print("\nIDENTITAS BINATANG\n\n");
                    System.out.print("Nama binatang: ");
                    a[count].setNama(in.nextLine());
                    System.out.print("Nama pemilik: ");
                    a[count].setPemilik(in.nextLine());
                    System.out.print("Usia binatang: ");
                    a[count].usia = in.nextInt();
                    System.out.print("Kecepatan binatang: ");
                    a[count].setKecepatan(in.nextInt());
                    in.nextLine();
                    count++;
                    an++;
                    break;

                case "Kucing":
                case "kucing":
                case "k":
                case "K":
                    k[count] = new Kucing();
                    k[count].setKodeBinatang("K", ku);
                    System.out.print("\nIDENTITAS BINATANG\n\n");
                    System.out.print("Nama binatang: ");
                    k[count].setNama(in.nextLine());
                    System.out.print("Nama pemilik: ");
                    k[count].setPemilik(in.nextLine());
                    System.out.print("Usia binatang: ");
                    k[count].usia = in.nextInt();
                    System.out.print("Berat binatang: ");
                    k[count].setBerat(in.nextInt());
                    count++;
                    ku++;
                    in.nextLine();
                    break;
                default:
                    System.out.print("\nPilihan tidak tersedia!!\nTekan ENTER untuk melanjutkan...");
                    in.nextLine();
                    break;
            }
        }
        while (!pilihan.equals("n")) {
            System.out.print("\nMENU\n\n");
            System.out.print("1. Lihat identitas\n2. Cari Identitas\nExit (n)\n");
            System.out.print("Masukkan pilihan: ");
            pilihan = in.nextLine();
            switch (pilihan) {
                case "1":
                    System.out.print("\nKODE\t|NAMA\t|PEMILIK\n");
                    for (int i = 0; i < jumlah; i++) {
                        if (a[i] != null) {
                            System.out.println(
                                    a[i].getKodeBinatang() + "\t|" + a[i].getNama() + "\t|" + a[i].getPemilik());
                        } else if (k[i] != null) {
                            System.out.println(
                                    k[i].getKodeBinatang() + "\t|" + k[i].getNama() + "\t|" + k[i].getPemilik());
                        }
                    }
                    break;
                case "2":
                    System.out.print("\nMasukkan identitas (kode/nama/pemilik): ");
                    data = in.nextLine();
                    for (int i = 0; i < jumlah; i++) {
                        if (a[i] != null && (a[i].getKodeBinatang().equalsIgnoreCase(data)
                                || a[i].getNama().equalsIgnoreCase(data)
                                || a[i].getPemilik().equalsIgnoreCase(data))) {
                            System.out.print("\nKODE\t|NAMA\t|PEMILIK\t|KECEPATAN\n");
                            System.out.println(a[i].getKodeBinatang() + "\t|" + a[i].getNama() + "\t|" + a[i].getPemilik() + "\t\t|" + a[i].getKecepatan());
                            a[i].menggonggong(a[i].getNama());
                            break;
                        } else if (k[i] != null && (k[i].getKodeBinatang().equalsIgnoreCase(data)
                                || k[i].getNama().equalsIgnoreCase(data)
                                || k[i].getPemilik().equalsIgnoreCase(data))) {
                            System.out.print("\nKODE\t|NAMA\t|PEMILIK\t|BERAT\n");
                            System.out.println(k[i].getKodeBinatang() + "\t|" + k[i].getNama() + "\t|" + k[i].getPemilik() + "\t\t|" + k[i].getBerat());
                            k[i].mengeong(k[i].getNama());
                            break;
                        } else if (i == (jumlah - 1)){
                            System.out.print("\nIdentitas binatang yang anda cari tidak ada...\nTekan ENTER untuk melanjutkan...");
                            in.nextLine();
                            break;
                        }
                    }
                    break;
                case "n":
                    System.exit(0);
                    break;
                default:
                    System.out.print("\nPilihan tidak tersedia!!\nTekan ENTER untuk melanjutkan...");
                    in.nextLine();
                    break;
            }
        }
        in.close();
    }
}