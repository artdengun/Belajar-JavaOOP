package Latihan.Encapsulation;

public class PanggilEncapsulation {
    public static void main(String[] args) {
        Encapsulation objek = new Encapsulation();
        objek.setNama("deni");
        objek.setAddres("payangan");
        objek.setUmur(50);
        System.out.println(objek.getNama());
        System.out.println(objek.getAddres());
        System.out.println(objek.getUmur());
        }
}
