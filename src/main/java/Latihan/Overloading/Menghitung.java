package Latihan.Overloading;

public class Menghitung {
    public static void main(String[] args) {
        // buat penamoung untuk menampilkan penjumlahan
        Overloading latihan = new Overloading();
        int penjumlahan1 = latihan.penjumlahan(10,20);
        int penjumlahan2 = latihan.penjumlahan(10,20,30);
        int penjumlahan3 = latihan.penjumlahan(10,20,30,50);

        System.out.println(penjumlahan1);
        System.out.println(penjumlahan2);
        System.out.println(penjumlahan3);
    }
}
