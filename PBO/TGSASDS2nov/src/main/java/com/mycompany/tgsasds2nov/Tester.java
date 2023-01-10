package com.mycompany.tgsasds2nov;

//NAMA : Leonnyndra Putra Pratama
//NIM  : 672021152

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan jumlah Binatang: ");
		int jumlah = s.nextInt();
                int a = 0;
		s.nextLine();
		String kasus = "0";
		Binatang[] binatang = new Binatang [jumlah];
		Anjing anjing;
                Kucing kucing;		

		while (a < jumlah) {
			System.out.println(" ");
			System.out.println("Binatang #" + (a + 1));
			System.out.println("1. Anjing");  
                        System.out.println("2. Kucing");
			System.out.print("Jenis binatang : ");
			kasus = s.nextLine();

			switch (kasus) {
				case "1":
					anjing = new Anjing();
					System.out.print("Masukkan nama : ");
					anjing.Nama = s.nextLine();
					System.out.print("Masukkan ras : ");
					anjing.Ras = s.nextLine();
					System.out.print("Masukkan kecepatan : ");
					anjing.setKecepatan(s.nextInt());
					s.nextLine();
					binatang[a] = anjing;
					binatang[a].Jenis = "Anjing";
					a++;
					break;
                                        
				case "2":
					kucing = new Kucing();
					System.out.print("Masukkan nama : ");
					kucing.Nama = s.nextLine();
					System.out.print("Masukkan ras : ");
					kucing.Ras = s.nextLine();
					System.out.print("Masukkan berat : ");
					kucing.setBerat(s.nextInt());
					s.nextLine();
					binatang[a] = kucing;
					binatang[a].Jenis = "Kucing";
					a++;
					break;
                                        
				default:
					System.out.println("Inputan Salah");
					break;
			}
		}

		kasus = "0";
		while (!kasus.equals("5")) {
                        System.out.println(" ");
                        System.out.println(" ");
			System.out.println("======= TUGAS PEMROGRAMAN =======");
			System.out.println("======= POLIMORFISME JAVA =======");
			System.out.println("1. Tampilkan semua nama binatang");
			System.out.println("2. Tampilkan semua data binatang");
			System.out.println("3. Tampilkan binatang terberat");
			System.out.println("4. Tampilkan binatang tercepat");
			System.out.println("5. Exit");
			System.out.print("Pilihan = ");
			kasus = s.nextLine();

			switch (kasus) {
				case "1":
					System.out.println(" ");
					System.out.println("======= Menu 1 : Semua Nama Binatang =======");
					for (int i = 0; i < binatang.length; i++) {
						System.out.print((i + 1) + ". ");
						binatang[i].CetakNama();
					}
					break;
				case "2":
					System.out.println(" ");
					System.out.println("======= Menu 2 : Semua DATA Binatang =======");
                                        System.out.println(" ");
					for (int i = 0; i < binatang.length; i++) {
						System.out.println("DATA Binatang ke #" + (i + 1));
						if (binatang[i].Jenis.equals("Anjing")) {
							anjing = (Anjing) binatang[i];
							anjing.Cetak();
						} else if (binatang[i].Jenis.equals("Kucing")) {
							kucing = (Kucing) binatang[i];
							kucing.Cetak();
						}
					}
					break;
				case "3":
					int terberat = -1;
					System.out.println(" ");
					System.out.println("======= Menu 3 : DATA Binatang Terberat =======");
					for (int i = 0; i < binatang.length; i++) {
						if (binatang[i].Jenis.equals("Kucing")) {
							kucing = (Kucing) binatang[i];
							if (kucing.getBerat() > terberat) {
								terberat = kucing.getBerat();
							}
						}
					}
					if (terberat == -1) {
						System.out.println("Tidak ada data kucing");
					} else {
						for (int i = 0; i < binatang.length; i++) {
							if (binatang[i].Jenis.equals("Kucing")) {
								kucing = (Kucing) binatang[i];
								if (kucing.getBerat() == terberat) {
									System.out.println("Kucing " + kucing.Nama + " adalah yang terberat (" + kucing.getBerat() + " kg)");
								}
							}
						}
					}
					break;
				case "4":
					int tercepat = -1;
					System.out.println(" ");
					System.out.println("======= Menu 4 : DATA Binatang Tercepat =======");
					for (int i = 0; i < binatang.length; i++) {
						if (binatang[i].Jenis.equals("Anjing")) {
							anjing = (Anjing) binatang[i];
							if (anjing.getKecepatan() > tercepat) {
								tercepat = anjing.getKecepatan();
							}
						}
					}
					if (tercepat == -1) {
						System.out.println("Tidak ada data anjing");
					} else {
						for (int i = 0; i < binatang.length; i++) {
							if (binatang[i].Jenis.equals("Anjing")) {
								anjing = (Anjing) binatang[i];
								if (anjing.getKecepatan() == tercepat) {
									System.out.println("Anjing " + anjing.Nama + " adalah yang tercepat (" + anjing.getKecepatan() + " mph)");
								}
							}
						}
					}
					break;
				case "5":
					System.exit(0);
					break;

				default:
					System.out.println("Inputan Salah");
					break;
			}
		}
	}
}