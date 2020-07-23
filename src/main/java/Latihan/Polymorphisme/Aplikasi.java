package Latihan.Polymorphisme;

public class Aplikasi {
    public static void main(String[] args) {
        // polymorphisme bisa artinya adalah kita bisa menggunakan induk atau anak dari class turunanya
        //
        // objek movie bisa kita ganti dengan kelas turunanya
        Movie m = new Movie();
        m.setJudul("benci bilang cinta");
        m.setJadwal("besok");
        m.setUmur(20);

        Emak ema = new Emak();
        ema.InstanceEma(m);
    }
}
