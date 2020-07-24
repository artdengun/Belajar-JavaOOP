package Latihan.InnerClass;

public class PanggilInnerClass {
    public static void main(String[] args) {
        inner objek = new inner();
        inner.Mahasiswa objekMahasiswa = objek.new Mahasiswa();
        inner.Dosen objekDosen = objek.new Dosen();
        inner.Staff objekStaff = objek.new Staff();

        objekDosen.setDosen("dosen");
        System.out.println(objekDosen.getDosen());

        objekStaff.setNamaStaff("namaStaff");
        System.out.println(objekStaff.getNamaStaff());


        objekMahasiswa.getNamaMahasiswa("denigunawan "," deni ");
        objekMahasiswa.getDosenMahasiswa("ridwan");
        System.out.println(objekMahasiswa.setNamaMahasiswa());
        System.out.println(objekMahasiswa.setDosenMahasiswa());
    }
}
