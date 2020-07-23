package Latihan.KeywordStatic;

public class Static {
    // pada pendeklarasian static kita tidak perlu membuat objek kembali ketika
    // kita melakukan pembuatan objek pad akelas kita sendiri

    static String nama = " Deni Gunawan";
    static int umur;

        // prosedur
    public static void tanyaNama(){
        System.out.println("nama saya adalah"+nama);
    }

    public  static int  umur(){
        int tanyaumur = 20;
        return tanyaumur;
    }

}
