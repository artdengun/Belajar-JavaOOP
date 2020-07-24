package Latihan.JavaBeans;

public class PanggilBean {
    public static void main(String[] x){
        Bean objek = new Bean();
        objek.setNama("deni gunawan");
        objek.setPanggilan("gunawan");
        objek.setAlamat("kp payangan");
        System.out.println(objek.getNama());
        System.out.println(objek.getPanggilan());
        System.out.println(objek.getAlamat());
    } 
    
}