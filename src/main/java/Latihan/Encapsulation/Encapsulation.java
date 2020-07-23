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
        public void setNama(){
            this.nama = nama;
        }
        // fuction
        public String getAddres(){
            return  this.addres;
        }
        // prosedur
        public void setAddres(){
            this.addres = addres;
        }
        // function
        public int getUmur(){
            return this.umur;
        }
        // prosedur
        public void setUmur(){
            this.umur = umur;
        }
}
