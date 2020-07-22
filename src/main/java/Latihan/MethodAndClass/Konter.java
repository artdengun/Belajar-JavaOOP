package Latihan.MethodAndClass;

public class Konter {
    public static void main(String[] args) {

        Hp jenis = new Hp();

        jenis.Realme5();
        jenis.Iphone();

        int Hasil = jenis.menghitungLebar();
        int Hasil1 = jenis.menghitungPanjang();
        System.out.println(Hasil);
        System.out.println(Hasil1);



    }
}
