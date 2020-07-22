package Latihan.MethodAndClass;

public class Hp {

    String merek;
    String warna;
    String jenis;
    int harga;
    int ram;

        // prosedur -> dapat menghasilak banyak perintah, ditandai dengan tulisan void
    void Realme5(){
        Hp Realme5 = new Hp();
        System.out.println("=========================");
        System.out.println(Realme5.merek = " REALME ");
        System.out.println(Realme5.warna = " Biru");
        System.out.println(Realme5.jenis = " Hp cina");
        System.out.println(Realme5.harga = 180000);
        System.out.println(Realme5.ram = 5);
        System.out.println("=========================");
    }
        // prosedur dapat menghasilkan banyak nilai dan tidak memerulukan return untuk menghasilkan nilainya
    void Iphone(){
        Hp iphone = new Hp();
        System.out.println("=========================");
        System.out.println(iphone.merek = " Apple ");
        System.out.println(iphone.warna = " Putih ");
        System.out.println(iphone.jenis = " Amerika ");
        System.out.println(iphone.harga = 80000);
        System.out.println(iphone.ram = 2);
        System.out.println("=========================");
    }

    // function , function hanya menghasilakan satu nilai dan memperlukan return untuk menampilkan nilai

        int panjang = 8;
        int lebar = 16;
        int tinggi = 5;

        int menghitungPanjang(){
            int itunpanjang = panjang * tinggi * lebar;
            return itunpanjang;
        }
        int menghitungLebar(){
            int itunLebar = lebar * tinggi * panjang;
            return  itunLebar;
        }


}
