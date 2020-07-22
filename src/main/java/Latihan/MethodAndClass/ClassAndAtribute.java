package Latihan.MethodAndClass;

public class ClassAndAtribute {

        // final digunakan untuk menset nilai tidak bisa diubah di class manampun
        // constanta artinya adalah nilai yang diisi tidak bisa diubah di class manapun.
        // nilainya default

        // atribut adalah data pendukung di class
       final   String mobil = "Mobilio";
        String warna = " Merah";
        int harga = 5000;
        int tahunPembuatan = 2020;

        int jarak = 90;
        int kecepatan = 60;
        int waktu = 3600;


        // method
        // 1. buat prosedur Setiap Anotasi Void berarti dinamakan prosedur yang harus ada nilai dan value
        // banyak mengeluarkan perintah
        // sedangkan return untuk mengembalikan nilai atau memunculkan nilai
        void jalan(){
                System.out.println("Melaju cepat");
                System.out.println("warna mobil adalah "  + warna);
                System.out.println("Harga Mobil adalah "  + harga);
        }

        // 2. function   - function hanya mengeluarkan satu perintah,
        // - function wajib punya return

        int jarakTempuh(){
                int itungJarak = kecepatan * waktu;
                return itungJarak;
        }

        int waktuTempuh(){
                int waktuTempuh = jarak / kecepatan;
                return waktuTempuh;
        }



}
