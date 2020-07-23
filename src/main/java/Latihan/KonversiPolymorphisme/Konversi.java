package Latihan.KonversiPolymorphisme;

public class Konversi {
    public static void main(String[] args) {
        // ini adalah method konversi polymorphime

        Kampus k = new Mahasiswa();
        Mahasiswa m = (Mahasiswa) k;

        m.setNama("Deni Gunawan");
        m.setNamaMahasiswa("Ahmad Zaelnai");
        System.out.println("hallo nama saya adalah "  + m.getNama());
        System.out.println("Perkanlkan nama say adalah " + m.getNamaMasiswa());
    }
}
