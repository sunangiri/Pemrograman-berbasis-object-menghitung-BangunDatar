package risqi.hitung;

import java.util.Scanner;

public class Hitung {

    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner input = new Scanner(System.in);
        BangunDatar bangunDatar;

        // Input data
        System.out.println("""
                           +++++++++++++++++++++
                           Jenis Bangunan Datar
                           +++++++++++++++++++++
                           Persegi
                           Lingkaran
                           Persegi Panjang
                           Segitiga
                           """);
        System.out.print("Masukkan jenis bangun datar: ");
        String jenisBangunDatar = input.nextLine();

        if (jenisBangunDatar.equals("Persegi")) {
            System.out.print("Masukkan sisi persegi: ");
            double sisi = input.nextDouble();

            // Buat objek persegi
            bangunDatar = new Persegi(sisi);

        } else if (jenisBangunDatar.equals("Lingkaran")) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jari = input.nextDouble();

            // Buat objek lingkaran
            bangunDatar = new Lingkaran(jari);

        } else if (jenisBangunDatar.equals("Persegi Panjang")) {
            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = input.nextDouble();

            // Buat objek persegi panjang
            bangunDatar = new PersegiPanjang(panjang, lebar);

        } else if (jenisBangunDatar.equals("Segitiga")) {
            System.out.print("Masukkan alas segitiga: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();

            // Buat objek segitiga
            bangunDatar = new Segitiga(alas, tinggi);

        } else {
            System.out.println("Jenis bangun datar yang Anda masukkan tidak valid.");
            return;
        }

        // Hitung luas dan keliling bangun datar
        bangunDatar.hitungLuas();
        bangunDatar.hitungKeliling();

        // Tampilkan hasil
        System.out.println("Luas bangun datar: " + bangunDatar.getLuas());
        System.out.println("Keliling bangun datar: " + bangunDatar.getKeliling());
    }
}
