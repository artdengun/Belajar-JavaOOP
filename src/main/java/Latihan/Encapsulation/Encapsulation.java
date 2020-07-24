package Latihan.Encapsulation;

public class Encapsulation {
    private  String nama = "Deni gunawan";
    private  String addres = "Kp. Payangan RT 04 RW 06";
    private  int umur = 10;

    // kita bungkus menggunakan get
    // functionya
    public String getNama() {
        return this.nama;
    }
    // KIita bisa modif file disini
    // prosedur
        public void setNama(String nama){
            this.nama = nama;
        }
        // fuction
        public String getAddres(){
            return  this.addres;
        }
        // prosedur
        public void setAddres(String addres){
            this.addres = addres;
        }
        // prosedur
        public void setUmur(int umur){
            this.umur = umur;
        }
        // function
        public int getUmur(){
            return this.umur;
        }
}
