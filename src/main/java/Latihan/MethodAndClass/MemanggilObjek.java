package Latihan.MethodAndClass;

public class MemanggilObjek {


    public static void main(String[] args) {

        ClassAndAtribute objek = new ClassAndAtribute();
//
//        System.out.println(objek.mobil);
//        System.out.println(objek.tahunPembuatan = 2019);
//        System.out.println(objek.warna = "kuning");
//        System.out.println(objek.harga = 512451);


//              prosedur
//            objek.jalan();

        // function

        // nilainya ditampung dulu kemudian objeknya baru bisa dipanggil
        // nilai penampungnya harus sesuai dengan tipe data functionnya
        int menghitungJarak = objek.jarakTempuh();
        int waktuTempuh = objek.waktuTempuh();
        System.out.println(" jarak tempuhnya adalah " + menghitungJarak);
        System.out.println("Waktu tempuhnya adalah " + waktuTempuh);
    }
}
