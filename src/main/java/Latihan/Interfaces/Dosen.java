package Latihan.Interfaces;
public class Dosen implements MahasiswaRepository, NilaiMahasiswaRepository {

    public void namaMahasiswa() {
        System.out.println("Deni Gunawan");
    }

    public int nikMahasiswa() {
        return 18001020;
    }

    public void pelajaranMahasiswa() {
        System.out.println("bahasa indonesia ");
    }

    public void nilaiMahasiswa() {
        System.out.println("80");
    }
}
