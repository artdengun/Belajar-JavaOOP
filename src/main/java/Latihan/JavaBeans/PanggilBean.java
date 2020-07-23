package Latihan.JavaBeans;

public class PanggilBean {
    public static void main(String[] args) {
        Bean objek = new Bean();

       objek.setNama("Deni Gunawan");
       objek.setPanggilan("deni");
       objek.setAlamat("kp. payangan");
       objek.setUmur(23);
       objek.setBerat(50);
        System.out.println(objek.getNama());
        System.out.println(objek.getAlamat());
        System.out.println(objek.getPanggilan());
        System.out.println(objek.getUmur());
        System.out.println(objek.getBerat());

    }
}


