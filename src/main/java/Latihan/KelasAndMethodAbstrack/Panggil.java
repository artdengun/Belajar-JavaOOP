package Latihan.KelasAndMethodAbstrack;

public class Panggil {
    public static void main(String[] args) {

//        Mahasiswa m = new Mahasiswa() {
//
//            public void name() {
//
//            }
//
//            public void umur() {
//
//            }
//        };

        // kita menggunakan konsep polymorphime
        // kita memakai kelas turunanya

        Mahasiswa objek = new Nilai();
            objek.name();
            objek.umur();
    }
}
