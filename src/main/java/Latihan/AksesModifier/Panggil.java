package Latihan.AksesModifier;

import Latihan.Constructor.Public;

public class Panggil {
    public static void main(String[] args) {
        Public objek = new Public();

        objek.nama = "deni gunawan";
        objek.alamat = "Kp. Payangan";
//
//        objek.umur = 25;  // private
//        objek.nik = 20 ;  // protected
        }
}
